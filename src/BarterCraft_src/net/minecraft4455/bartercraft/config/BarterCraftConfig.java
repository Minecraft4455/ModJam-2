package net.minecraft4455.bartercraft.config;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Field;

import net.minecraftforge.common.Configuration;

public class BarterCraftConfig {

	@Retention(RetentionPolicy.RUNTIME)
	public static @interface CfgBool {

	}

	@Retention(RetentionPolicy.RUNTIME)
	public static @interface CfgID {

		public boolean block() default false;

	}
	
	public static @CfgID int BriefCase01ID = 3000;
	public static @CfgID int BlueCupcakeID = 9001;
	public static @CfgID int GhostlyLanternID = 9002;
	public static @CfgID int GillysBootsID = 9003;

	public static void start(Configuration config) {

		try {

			config.load();
			final Field[] fields = BarterCraftConfig.class.getFields();
			for (final Field field : fields) {

				final CfgID annotation = field.getAnnotation(CfgID.class);
				if (annotation != null) {

					int id = field.getInt(null);
					if (annotation.block())
						id = config.getBlock(field.getName(), id).getInt();
					else
						id = config.getItem(field.getName(), id).getInt();

					field.setInt(null, id);

				} else if (field.isAnnotationPresent(CfgBool.class)) {

					boolean bool = field.getBoolean(null);
					bool = config.get(Configuration.CATEGORY_GENERAL,
							field.getName(), bool).getBoolean(bool);
					field.setBoolean(null, bool);

				}
			}
		} catch (final Exception e) {
		} finally {

			config.save();

		}
	}
}
