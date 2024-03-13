package com.careerit.jfs.java14features;

public final class IdGenerator {

        private IdGenerator() {
        }

        public static String generateId() {
            return "AP" + System.currentTimeMillis();
        }
}
