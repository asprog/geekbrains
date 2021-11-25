package ru.gb_cource2.lesson7.accuWeather;

public enum RequestParam {
    PROTO{
        public String toString(){
            return "http";
        }
    },
    HOST{
        public String toString(){
          return "dataservice.accuweather.com";
        }
    },
    FORECAST{
        public String toString(){
            return "forecasts";
        }
    },
    DAILY {
        public String toString(){
            return "daily";
        }
    },
    DAYS{
       public String toString(){
           return "5day";
       }
    },
    API_VERSION{
        public String toString(){
            return "v1";
        }
    },
    CITY_ID{
        public String toString(){
            return "295212";
        }
    },
    API_KEY{
        public String toString(){
            return "BRP2KWnDWBRFeqgQuVrYsnu0TJNAACJx";
        }
    },
    LANG{
        public String toString(){
            return "ru-ru";
        }
    },
    DETAILS{
        public String toString(){
            return "false";
        }
    },
    METRIC{
        public String toString(){
            return "true";
        }
    }

 }
