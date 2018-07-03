# Como guardar informacion

```
	SharedPreferences userInfo = getSharedPreferences("KEY NAME",MODE_PRIVATE);

	SharedPreferences.Editor userInfoEdit = userInfo.edit();

	userInfoEdit.putString("name",INFORMACION EN STRING);

	userInfoEdit.apply();
```

# Como recuperar la informacion

```
	private SharedPreferences objUser;

	this.objUser = getSharedPreferences("KEY NAME",MODE_PRIVATE);

	objUser.getString("fecha","")
```
