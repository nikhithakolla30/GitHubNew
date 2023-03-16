package com.nikhitha.HelloNameProject.HelloNameProject;


    class Bird {
        public String name;
         public String color;
        public Boolean canFly;

        @Override
        public String toString() {
            return "Bird{" +
                    "name='" + name + '\'' +
                    ", color='" + color + '\'' +
                    ", canFly=" + canFly +
                    '}';
        }
    }
