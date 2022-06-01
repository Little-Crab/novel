package io.github.pjfopen.novel.core.common.constant;

/**
 * className: CommonConstants
 * description: 通用常量
 *
 * @author pjf
 * date: 2022/5/24
 **/
public class CommonConstants {
    /**
     * 是
     */
    public static final Integer YES = 1;

    /**
     * 否
     */
    public static final Integer NO = 0;

    /**
     * 性别常量
     */
    public enum SexEnum {

        /**
         * 男
         */
        MALE(0, "男"),

        /**
         * 女
         */
        FEMALE(1, "女");

        SexEnum(int code, String desc) {
            this.code = code;
            this.desc = desc;
        }

        private int code;
        private String desc;

        public int getCode() {
            return code;
        }

        public String getDesc() {
            return desc;
        }

    }
}