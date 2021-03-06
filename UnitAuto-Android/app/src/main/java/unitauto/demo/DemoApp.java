/*Copyright ©2020 TommyLemon(https://github.com/TommyLemon/UnitAuto)

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.*/


package unitauto.demo;

import android.app.Application;

import unitauto.apk.UnitAutoApp;

public class DemoApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        UnitAutoApp.init(this);

        // 可重写 MethodUtil.INSTANCE_GETTER 来实现自定义获取实例的方式，或者做一些初始化操作，类似 Mokito @BeforeMethod
        // final MethodUtil.InstanceGetter ig = MethodUtil.INSTANCE_GETTER;
        // MethodUtil.INSTANCE_GETTER = new MethodUtil.InstanceGetter() {
        //     @Override
        //     public Object getInstance(Class<?> clazz, List<MethodUtil.Argument> args, Boolean reuse) throws Exception {
        //         if (DemoApp.class.isAssignableFrom(clazz)) {
        //             return DemoApp.this;
        //         }
        //
        //         return ig.getInstance(clazz, args, reuse);
        //     }
        // };
    }

}
