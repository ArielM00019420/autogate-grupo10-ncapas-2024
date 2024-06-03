package com.grupo10.autogategrupo10.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

import java.util.UUID;

public class GoogleController {
    @Controller("/api/auth")
    public class GoogleOAuthController {

        @Value("${spring.security.oauth2.client.registration.google.client-id}")
        private String clientId;

        @Value("${spring.security.oauth2.client.registration.google.redirect-uri}")
        private String redirectUri;

        @GetMapping("/login")
        public RedirectView login() {
            String state = UUID.randomUUID().toString();
            String scope = "profile email";
            String authorizationUri = "https://accounts.google.com/o/oauth2/auth";

            String redirectUrl = authorizationUri + "?response_type=code"
                    + "&client_id=" + clientId
                    + "&redirect_uri=" + redirectUri
                    + "&scope=" + scope
                    + "&state=" + state;

            return new RedirectView(redirectUrl);
        }
    }
}
