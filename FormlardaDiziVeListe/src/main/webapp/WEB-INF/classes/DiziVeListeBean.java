/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


import java.io.IOException;
import java.util.Map;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.util.LinkedHashMap;

/**
 *
 * @author hatice.kemence
 */
@ManagedBean
@SessionScoped
public class DiziVeListeBean implements Filter {
    
    @Override
    public void destroy(){
        
    }
    
    @Override
    public void init(FilterConfig arg0) throws ServletException {
        
    }
    
    @Override
    public void doFilter(ServletRequest request,ServletResponse response, FilterChain chain) throws IOException, ServletException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        chain.doFilter(request, response);
    }
    
    String film1;
    String film2="Hababam Sınıfı";
    String film3="Geleceğe Dönüş 1";
    
    String hababamSinifi[]={"Hababam Sınıfı", "Hababam Sınfı Sınıfta Kaldı", "Hababam Sınıfı Uyanıyor", "hababm Sınıfı Tatilde"};
    static Map<String,Object> gelecegeDonus;
    
    static{
        gelecegeDonus= new LinkedHashMap<String,Object>();
        gelecegeDonus.put("Geleceğe Dönüş 1", "geleceğe Dönüş 1");
        gelecegeDonus.put("Geleceğe Dönüş 2", "geleceğe Dönüş 2");
        gelecegeDonus.put("Geleceğe Dönüş 3", "geleceğe Dönüş 3");
        
    }
    public Map<String, Object> getGelecegeDonus(){
        return gelecegeDonus;
    }

    public String getFilm1() {
        return film1;
    }

    public void setFilm1(String film1) {
        this.film1 = film1;
    }

    public String getFilm2() {
        System.out.println("Döndürülen Film 2"+film2);
        return film2;
    }

    public void setFilm2(String film2) {
        this.film2 = film2;
    }

    public String getFilm3() {
        System.out.println("Döndürülen Film 3"+ film3);
        return film3;
    }

    public void setFilm3(String film3) {
        this.film3 = film3;
    }

    public String[] getHababamSinifi() {
        return hababamSinifi;
    }

    public void setHababamSinifi(String[] hababamSinifi) {
        this.hababamSinifi = hababamSinifi;
    }
    
    
    
}
