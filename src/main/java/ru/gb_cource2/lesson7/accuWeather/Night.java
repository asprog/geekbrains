package ru.gb_cource2.lesson7.accuWeather;

public class Night {
    /**
     * Copyright 2021 bejson.com
     */

    /**
     * Auto-generated: 2021-11-25 19:43:37
     *
     * @author bejson.com (i@bejson.com)
     * @website http://www.bejson.com/java2pojo/
     */

        private int Icon;
        private String IconPhrase;
        private boolean HasPrecipitation;
        private String PrecipitationType;
        private String PrecipitationIntensity;
        public void setIcon(int Icon) {
            this.Icon = Icon;
        }
        public int getIcon() {
            return Icon;
        }

        public void setIconPhrase(String IconPhrase) {
            this.IconPhrase = IconPhrase;
        }
        public String getIconPhrase() {
            return IconPhrase;
        }

        public void setHasPrecipitation(boolean HasPrecipitation) {
            this.HasPrecipitation = HasPrecipitation;
        }
        public boolean getHasPrecipitation() {
            return HasPrecipitation;
        }

        public void setPrecipitationType(String PrecipitationType) {
            this.PrecipitationType = PrecipitationType;
        }
        public String getPrecipitationType() {
            return PrecipitationType;
        }

        public void setPrecipitationIntensity(String PrecipitationIntensity) {
            this.PrecipitationIntensity = PrecipitationIntensity;
        }
        public String getPrecipitationIntensity() {
            return PrecipitationIntensity;
        }
}
