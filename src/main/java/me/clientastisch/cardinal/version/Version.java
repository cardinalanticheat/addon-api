package me.clientastisch.cardinal.version;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;
import java.util.Comparator;

/**
 * @author micartey
 * @since CAC v. 5.4.30
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Version {

    Type[] versions() default {};

    Type[] blacklisted() default {};

    public enum Type {

        VERSION_1_8(0),
        VERSION_1_9(0),
        VERSION_1_10(0),
        VERSION_1_11(0),
        VERSION_1_12(0),
        VERSION_1_13(0),
        VERSION_1_14(0),
        VERSION_1_15(0),
        VERSION_1_16(0),
        VERSION_1_17(0),
        VERSION_1_18(0),
        VERSION_1_19(0),
        VERSION_1_20(0),
        VERSION_1_21(0),
        BEDROCK(0),
        UNDEFINED(0);

        private final int protocol;

        Type(int protocol) {
            this.protocol = protocol;
        }

        /**
         * Check if a version is the current server version
         *
         * @return true if current server version
         */
        public boolean isCurrentVersion() {
            return false;
        }

        /**
         * Check if a version is newer than a version
         *
         * @param version to check
         * @return true if newer
         */
        public boolean isNewerOrEquals(Type version) {
            return false;
        }

        /**
         * Check if two versions are the same
         *
         * @param version version
         * @return true if equal
         */
        public boolean isEquals(Type version) {
            return false;
        }

        /**
         * Check if a version is older than a version
         *
         * @param version to check
         * @return true if older
         */
        public boolean isOlderOrEquals(Type version) {
            return false;
        }

        /**
         * Get the enum value for the current server version.
         * This method uses {@link Version.Type#isCurrentVersion}
         *
         * @return Type
         */
        public static Type getServerVersion() {
            throw new IllegalStateException("Implementation is provided by runtime");
        }

    }

}