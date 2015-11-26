package org.juzu.tutorial.services;

import org.juzu.tutorial.models.Comment;
import org.juzu.tutorial.models.Secret;

import java.util.List;
import java.util.Set;

public interface SecretService {

    public List<Secret> getSecrets();

    public void addSecret(String message, String imageUrl);

    public Comment addComment(String secretId, Comment comment);

    public Set<String> addLike(String secretId, String userId);
}
