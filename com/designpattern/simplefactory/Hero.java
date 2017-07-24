package com.designpattern.simplefactory;

public abstract Class Hero
{
    //英雄名称
	public String heroName;
	//英雄皮肤
	public Skin skin;

	//更换皮肤方法，虚拟方法由子类实现
	public abstract void changeSkin(String skinName);

	//英雄展示
	public void display()
	{
		skin.display();
	}

}