package com.autohome;

import java.util.ArrayList;

/**
 * Created by hujinliang on 2015/11/17.
 */

public class SysMenuVm
{
    public SysMenuVm()
    {
        setChildMenus(new ArrayList<SysMenuVm>());
    }
    private int Id;
    public final int getId()
    {
        return Id;
    }
    public final void setId(int value)
    {
        Id = value;
    }
    private String MenuName;
    public final String getMenuName()
    {
        return MenuName;
    }
    public final void setMenuName(String value)
    {
        MenuName = value;
    }

    private String LinkUrl;
    public final String getLinkUrl()
    {
        return LinkUrl;
    }
    public final void setLinkUrl(String value)
    {
        LinkUrl = value;
    }
    private String HighLightUrl;
    public final String getHighLightUrl()
    {
        return HighLightUrl;
    }
    public final void setHighLightUrl(String value)
    {
        HighLightUrl = value;
    }
    private String MenuType;
    public final String getMenuType()
    {
        return MenuType;
    }
    public final void setMenuType(String value)
    {
        MenuType = value;
    }
    private String CssName;
    public final String getCssName()
    {
        return CssName;
    }
    public final void setCssName(String value)
    {
        CssName = value;
    }

    private ArrayList<SysMenuVm> ChildMenus;
    public final ArrayList<SysMenuVm> getChildMenus()
    {
        return ChildMenus;
    }
    public final void setChildMenus(ArrayList<SysMenuVm> value)
    {
        ChildMenus = value;
    }
    private boolean ShowPage;
    public final boolean getShowPage()
    {
        return ShowPage;
    }
    public final void setShowPage(boolean value)
    {
        ShowPage = value;
    }
}
