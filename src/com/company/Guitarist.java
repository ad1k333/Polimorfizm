package com.company;

public class Guitarist extends Musician {
            public Guitarist(String name) {
            super(name);
        }

        @Override
        public void play() {
            System.out.println(this.name + " plays a guitar.");
        }
    }
