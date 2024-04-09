package com.careerit.di.rating;

public record Player(String name, String role, String country) {
}

record PlayerRating(String name, double rating) {
}

record PlayerWithRating(String name,String role, String country, double rating) {
}
