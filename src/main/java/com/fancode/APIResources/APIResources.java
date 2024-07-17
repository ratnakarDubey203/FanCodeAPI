package com.fancode.APIResources;

public enum APIResources {
    getTodos("/todos"),
    getPosts("/posts"),
    getComments("/comments"),
    getAlbums("/albums"),
    getPhotos("/photos"),
    getUsers("/users");

    private String resource;

    APIResources(String resource) {
        this.resource = resource;
    }

    public String getResource() {
        return resource;
    }
}
