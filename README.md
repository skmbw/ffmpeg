# ffmpeg

## 对ffmpeg命令的封装
## 对ffmpeg命令的学习的代码
* 参数key和参数值要分开，否则会全部作为一个参数key，导致 Unrecognized option 'hls_time 5'，就是不认识这个参数
* 所有另外的参数都可以通过extras options来传递
