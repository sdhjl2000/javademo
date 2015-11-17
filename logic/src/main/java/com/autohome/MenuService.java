package com.autohome;

import retrofit.Call;
import retrofit.http.GET;
import retrofit.http.Query;

import java.util.List;

/**
 * Created by hujinliang on 2015/11/17.
 */
public interface MenuService {
        @GET("/api/api/Menus/Get")
        Call<List<SysMenuVm>> GetMenus(@Query("companyid") Integer companyid,@Query("rid") Integer rid,@Query("appname") String appname);

}
