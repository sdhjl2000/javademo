package com.autohome;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.squareup.okhttp.OkHttpClient;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import retrofit.Call;
import retrofit.JacksonConverterFactory;
import retrofit.Retrofit;
import com.autohome.*;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException {
        System.out.println( "Hello World!" );
       // HttpClient<ArrayList<SysMenuVm>> client=new HttpClient<ArrayList<SysMenuVm>>();
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");

        HttpClient<ArrayList<SysMenuVm>> client = (HttpClient<ArrayList<SysMenuVm>>) context.getBean("helloBean");

        String url="http://ics.dealer.api.autohome.com.cn/api/api/Menus/Get?companyid=62669&rid=0&appname=dms";
        ArrayList<SysMenuVm> result= client.DoGet(url, SysMenuVm.class);
        ObjectMapper mapper = new ObjectMapper();
        System.out.println(mapper.writerWithDefaultPrettyPrinter().writeValueAsString(result));

    }
    public  static  List<SysMenuVm> GetMenu() throws IOException {
        OkHttpClient client = new OkHttpClient();
       // Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("127.0.0.1", 8888));
      //  client.setProxy(proxy);
        ObjectMapper mapper = new ObjectMapper();
        mapper.setPropertyNamingStrategy(PropertyNamingStrategy.PASCAL_CASE_TO_CAMEL_CASE);
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://ics.dealer.api.autohome.com.cn").client(client).addConverterFactory(JacksonConverterFactory.create(mapper)).build();
        MenuService service = retrofit.create(MenuService.class);
        Call<List<SysMenuVm>> menus= service.GetMenus(62669, 0, "dms");
        return menus.execute().body();
    }
}
