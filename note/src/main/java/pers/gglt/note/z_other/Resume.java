package pers.gglt.note.z_other;

public class Resume {
    /**注意点*/
    // 技术细节不要写进简历，看不懂的直接给你下了
    // 一筛HR关注点，学校，年龄，自我评价，证书来看基础能力和潜力。从项目内容，类型，规模，在项目里的定位来看业务能力

    /**自我介绍*/


    // 熟悉Android手机软件架构，3年以上的Android开发经验；
    // 精通Java语言，熟练掌握Java开发技术，具备扎实的编程基本功和良好的编程习惯；
    // 熟悉面向对象的程序设计方法，熟悉设计模式；
    // 精通多线程编程，精通网络编程，熟悉JNI原理；
    // 精通Android的基本组件使用,熟练使用Android各种布局与控件；
    // 熟悉retrofit 、rxjava 、Fastjson 、EventBus、universal-image-loader、asmack等开源第三方组件；
    // 对Android的Framework有较深入理解，熟悉主流开源组件及各种特性；
    // 熟悉Android平台UI设计，能够熟练使用Android SDK；
    // 性能优化；
    // UI适配

    // 项目经验
    // 智能门禁系统
    // 参与技术选型，重构框架。安卓终端技术栈采用，开发文件断点续传，
    // 项目迭代，性能优化
    // 对接小程序，后台管理系统，PC端
    // 人脸识别，可视对讲，刷卡通行，扫码通行，密码通行
    //

    // 人脸注册时存储faceId，之后进行本地人脸识别
    // 人脸识别流程
    // 打开相机，对相机帧数据进行处理，识别到人脸后提取人脸特征值，并从一个保存人脸特征值的数据集合中找到最匹配的特征值，若特征相似度大于阈值，则识别成功
    //

    // 编写开发过程文档及对外接口文档


    //MVVM 搭建 app 框架 采用 MVVM 模式将 View 层的控件和 model 层的数据通过中间桥梁 viewModel 实现双向绑定，而 view和 model 没有直接的交互，实现了 view和 model 的解藕，VM 层获取数据，直接通过 databinding 实现跟 xml 的双向绑定，通过使用 liferecycle 实现对 activity 生命周期的监听。使用 livedata 使数据包装成一个被观察者，页面成为观察者，这样数据发生变化时，页面可以被通知，进而更新 UI。

    //app 视频支持重力感应，自动切换横竖屏。 2. 自动切换监听器选择。 开始使用OrientationEventListener 事件角度监听器，但是角度变化连续， 横竖屏有时分不清。造成误判。最后选择加速度传感器监听。根据坐标x，y大小区别手机状态。 3. 自动切换横竖屏与手动切换横竖屏的冲突。在手机横屏，而且视频也是横屏播放状态下， 手动退出横屏。这时，会快速感应到手机状态，视频会自动切回横屏状态。 解决方案: 手动切换时暂停发送msg去改变UI。直到手机横竖屏状态与视频横竖屏状态一致， 才重新开始发送msg去改变UI。


    //通过门禁设备和监控摄像头对入场人员的运动轨迹进行实时展示，对消失的人员进行通知栏报警，并支持人员历史轨迹查看和报警记录查看
    //使用EasyPlayer播放rtsp流
    //门禁设备作为入口, 从门禁打卡后表明人员进入监控区域内,由入口处的摄像头捕获,开始轨迹,

    //期间参与需求评审及技术选型
    //

    //负责设计测试用例比较百度和虹软识别算法的优劣以及中后期项目的开发


    //地图支持重力感应，自动切换横竖屏。实现自动切换监听器。 最初使用OrientationEventListener 监听器，但是角度变化连续，横竖屏有时无法分辨，造成误判。
    // 方向检测设备的轴是否从现实世界中旋转;它可以检测磁北方的倾斜度和度数.请注意,此传感器已弃用  https://www.yisu.com/zixun/205227.html

    // 因此选择加速度传感器监听，根据坐标x，y大小区别手机状态
    // activity方向默认跟随屏幕旋转,当横屏时界面右下方可退出横屏模式,

    //解决自动切换横竖屏与手动切换横竖屏的冲突。在手机横屏展示状态下，手动退出横屏时会感应到手机状态，地图自动切回横屏状态。因此在手动切换时暂停发送Msg去改变UI，直到手机横竖屏状态与视频横竖屏状态一致


    //实现大图加载处理。对于精度要求不高的大图加载处理图片本身，通过改变图片模式将ARG8888改成RGB565，修改图片格式，将PNG改成Webp，降低精度加载


    //对于精度要求高的采用局部加载，使用BitmapRegionDecoder类的decodeRegion方法，读取图片指定大小的数据，然后通过移动来动态改变显示区域的图片


    //门禁设备使用RK系列主板进行开发

    //终端通过人脸识别、可视对讲、刷卡、扫码实现通行

    //配合Web端后台管理系统进行人员权限管理，通行记录上传

    //由于早期项目代码结构混乱，业务界限不清晰，代码耦合度大，维护不便，同时UI类中有大量 View 无关代码，不利于页面流畅性和稳定性

    //为此我负责对该块代码进行重构和优化工作，使用Layout Inspector查看布局层次结构，使用约束布局减少层次嵌套，减少对背景的过度渲染

    //采用多Module来对业务分层解构，分为基础组件，业务基础组件，业务组件。根据高内聚低耦合的思路，引入了RXJava，EventBus等第三方库来解耦各个组件

    //实现特定故障的自动修复功能。例如，相机，读卡器打开失败、网络故障的自动重启，SD卡存储满的自删除等

}
