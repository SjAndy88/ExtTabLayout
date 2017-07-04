# ExtTabLayout
抽取了com.android.support:design中的TabLayout，增加tabIndicatorWidth和tabIndicatorWidthWithoutPadding属性

## 说明
tabIndicatorWidth属性用来自定义Indicator的宽度

tabIndicatorWidthWithoutPadding属性是用来定义Indicator的宽度和内容的宽度一致

两个属性不要一起使用。

## 使用
###Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

	allprojects {
		    repositories {
			        ...
			        maven { url 'https://jitpack.io' }
		    }
	}
	
###Step 2. Add the dependency

	dependencies {
		    compile 'com.github.User:Repo:Tag'
	}