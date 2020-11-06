/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

public class JokeDTO {
    
    String dadUrl;
    String dadJoke;
    String ChuckNorrisUrl;
    String ChuckNorrisValue;

    public JokeDTO(DadJokeDTO dad, ChuckNorrisDTO chuck) {
        this.dadJoke = dad.getJoke();
        this.ChuckNorrisUrl = chuck.getUrl();
        this.ChuckNorrisValue = chuck.getValue();
        this.dadUrl = "https://icanhazdadjoke.com";
    }

    public String getDadUrl() {
        return dadUrl;
    }

    public void setDadUrl(String dadUrl) {
        this.dadUrl = dadUrl;
    }

    public String getDadJoke() {
        return dadJoke;
    }

    public void setDadJoke(String dadJoke) {
        this.dadJoke = dadJoke;
    }

    public String getChuckNorrisUrl() {
        return ChuckNorrisUrl;
    }

    public void setChuckNorrisUrl(String ChuckNorrisUrl) {
        this.ChuckNorrisUrl = ChuckNorrisUrl;
    }

    public String getChuckNorrisValue() {
        return ChuckNorrisValue;
    }

    public void setChuckNorrisValue(String ChuckNorrisValue) {
        this.ChuckNorrisValue = ChuckNorrisValue;
    }
    
    
    
}
