# Gif Dialog Android动画对话框
[![platform](https://img.shields.io/badge/platform-Android-yellow.svg)](https://www.android.com)
[![API](https://img.shields.io/badge/API-16%2B-brightgreen.svg?style=plastic)](https://android-arsenal.com/api?level=16)
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg?style=flat-square)](https://www.apache.org/licenses/LICENSE-2.0.html)

## Dependency

Add this to your module's `build.gradle` file:

```gradle
dependencies {
	...
	implementation 'com.bestsoft32.tayyab:tt-fancy-gif-dialog:1.0.2'
}
```
<h2> Gif Dialog</h2>

```diff
new TTFancyGifDialog.Builder(MainActivity.this)
                    .setTitle("Online Shopping")
                    .setMessage("You don't have time for shopping, Visit our website for online shopping with discount price.")
                    .setPositiveBtnText("Ok")
                    .setPositiveBtnBackground("#22b573")
                    .setNegativeBtnText("Cancel")
                    .setNegativeBtnBackground("#c1272d")
                    .setGifResource(R.drawable.gif1)      //pass your gif, png or jpg
                    .isCancellable(true)
                    .OnPositiveClicked(new TTFancyGifDialogListener() {
                        @Override
                        public void OnClick() {
                            Toast.makeText(MainActivity.this,"Ok",Toast.LENGTH_SHORT).show();
                        }
                    })
                    .OnNegativeClicked(new TTFancyGifDialogListener() {
                        @Override
                        public void OnClick() {
                            Toast.makeText(MainActivity.this,"Cancel",Toast.LENGTH_SHORT).show();
                        }
                    })
                    .build();
```

<h2> Gif Dialog Without Negative Button</h2>

```diff
new TTFancyGifDialog.Builder(MainActivity.this)
                    .setTitle("Online Shopping")
                    .setMessage("You don't have time for shopping, Visit our website for online shopping with discount price.")
                    .setPositiveBtnText("Ok")
                    .setPositiveBtnBackground("#22b573")
                    .setGifResource(R.drawable.gif1)      //pass your gif, png or jpg
                    .isCancellable(true)
                    .OnPositiveClicked(new TTFancyGifDialogListener() {
                        @Override
                        public void OnClick() {
                            Toast.makeText(MainActivity.this,"Ok",Toast.LENGTH_SHORT).show();
                        }
                    })
                    .build();
```

## Screenshots

**Please click the image below to enlarge.**

<img src="https://github.com/lichao3140/GifDialog/blob/master/screenshot/screenshot1.gif" height="420" width="240" hspace="20"><img src="https://github.com/lichao3140/GifDialog/blob/master/screenshot/screenshot2.gif" height="420" width="240" hspace="20"><img src="https://github.com/lichao3140/GifDialog/blob/master/screenshot/screenshot4.gif" height="420" width="240">

## 资料
存在github的releases上<br>
http://blog.csdn.net/lib739449500/article/details/55261225<br>
存到bintray上<br>
上传到组织 https://www.jianshu.com/p/b5d3462407fc<br>
上传到个人 https://www.jianshu.com/p/9f81d5b5a451<br>

