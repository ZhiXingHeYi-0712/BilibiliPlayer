## Bilibili Player
写的很乱……  
有机会重构吧

#### alpha-0.3.5
* 修复从歌单退出时会重放歌曲的bug
* 修复点击未下载歌曲时闪退的bug
* **注意：本次更新更换了包名（怪我当初创建的时候眼瞎），请卸载旧版本！**

#### alpha-0.3.4
* 修复切换播放模式时的bug
* 修复单曲循环不能无限手动切歌的bug

#### alpha-0.3.3
* 优化设置页面，现在设置定时播放时点击确定会自动隐藏软键盘


#### alpha-0.3.2
* 修复列表循环不会生成下一首歌的bug

#### alpha-0.3.1
* 单曲循环可用，比起之前的单曲循环可以手动切歌
* 优化列表循环的内存消耗，现在不会重复加入歌曲

#### alpha-0.3.0
* 使用[Exoplayer](https://github.com/google/ExoPlayer)重构部分代码
* 新增：可拖动进度条，15秒快进，5秒快退（`Exoplayer`香啊）
* 已知问题：单曲循环不可用

#### alpha-0.2.1
* 修复播放按钮和播放状态不同步的bug
* 新增断开耳机自动暂停
* 现在定时会弹出提示

#### alpha-0.2.0
* 新增定时功能
* 修复bug

#### alpha-0.1.2
* 修复bug
  * 播放页走马灯效果刷新错误

#### alpha-0.1.1
* 历史记录  
* 主页面显示正在放的歌名  
* 随机播放和单曲循环（调平模式暂时不可用） 
* 修复部分bug  

#### alpha-0.1.0
完成最基本功能  
* 播放已下载音乐  
* 下载整个收藏夹  
* 播放/暂停/切歌（只支持按收藏夹顺序） 