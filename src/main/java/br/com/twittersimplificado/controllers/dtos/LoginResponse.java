package br.com.twittersimplificado.controllers.dtos;

public record LoginResponse(String accessToken, Long expiresIn) {
}
