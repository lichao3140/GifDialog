# Gif Dialog Android动画对话框
[![platform](https://img.shields.io/badge/platform-Android-yellow.svg)](https://www.android.com)
[![API](https://img.shields.io/badge/API-16%2B-brightgreen.svg?style=plastic)](https://android-arsenal.com/api?level=16)
[![License](https://img.shields.io/badge/license-Apache%202-4EB1BA.svg?style=flat-square)](https://www.apache.org/licenses/LICENSE-2.0.html)


## Dependency

Add this to your module's `build.gradle` file:

```gradle
dependencies {
	...
	compile 'com.bestsoft32.tayyab:tt-fancy-gif-dialog:1.0.2'
}
```
<h2> TT Fancy Gif Dialog</h2>

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

<h2> TT Fancy Gif Dialog Without Negative Button</h2>

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


<img src="https://github.com/tayyabtariq50/TTFancyGifDialog-Android/blob/master/screenshot/screenshot1.gif" height="420" width="240" hspace="20"><img src="https://github.com/tayyabtariq50/TTFancyGifDialog-Android/blob/master/screenshot/screenshot2.gif" height="420" width="240" hspace="20"><img src="https://github.com/tayyabtariq50/TTFancyGifDialog-Android/blob/master/screenshot/screenshot4.gif" height="420" width="240">


## Contributing

Please fork this repository and contribute back using
[pull requests](https://github.com/tayyabtariq50/TTFancyGifDialog-Android/pulls).

Any contributions, large or small, major features, bug fixes, are welcomed and appreciated
but will be thoroughly reviewed .

## License

* [Apache Version 2.0](http://www.apache.org/licenses/LICENSE-2.0.html)

```
Copyright 2018 Tayyab Tariq

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

 http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.