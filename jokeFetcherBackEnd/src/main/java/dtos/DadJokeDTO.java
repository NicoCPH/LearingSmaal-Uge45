/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dtos;

/**
 *
 * @author Alex Wagner
 */
public class DadJokeDTO {
    
    //String url;
    String joke;

    public DadJokeDTO(String joke) {
        //this.url = "dadjoke url";
        this.joke = joke;
    }

//    public String getUrl() {
//        return url;
//    }
//
//    public void setUrl(String url) {
//        this.url = url;
//    }

    public String getJoke() {
        return joke;
    }

    public void setJoke(String value) {
        this.joke = joke;
    }
    
    
    
}
