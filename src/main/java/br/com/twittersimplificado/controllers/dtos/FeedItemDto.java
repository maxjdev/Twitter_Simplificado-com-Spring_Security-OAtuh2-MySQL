package br.com.twittersimplificado.controllers.dtos;

public record FeedItemDto(long tweetId,
                          String content,
                          String username) {
}
