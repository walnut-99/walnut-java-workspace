# Git常用命令

详见：[Git 常用基本命令使用详细大全_git命令行-CSDN博客](https://blog.csdn.net/qtiao/article/details/97783243)

| 命令                       | 描述                                             | 示例                                                         |
| :------------------------- | ------------------------------------------------ | ------------------------------------------------------------ |
| git init                   | 初始化一个git仓库                                |                                                              |
| git clone                  | clone一个git仓库                                 |                                                              |
| git config                 | 配置信息                                         | git config --global user.name '你的用户名'<br/>git config --global user.email '你的邮箱' |
| git add                    | 添加文件到缓存命令                               | git add .<br>git add *.java                                  |
| git status                 | 查看文件的状态命令                               |                                                              |
| git diff                   | 查看更新的详细信息命令                           | 尚未缓存的改动：git diff<br/>查看已缓存的改动： git diff --cached<br/>查看已缓存的与未缓存的所有改动：git diff HEAD<br/>显示摘要而非整个 diff：git diff --stat |
| git commit                 | 提交命令                                         | git commit -m "第一次版本提交"<br>git commit -am "第一次版本提交"(跳过每次需要add一下) |
| git reset HEAD             | 取消缓存命令                                     | git reset HEAD test.txt                                      |
| git rm                     | 删除命令                                         | 慎用(详看网站)                                               |
| git mv                     | 移动或重命名命令                                 | git mv test.txt newtest.txt                                  |
| git branch                 | 查看分支命令                                     |                                                              |
| git branch (branchname)    | 创建分支命令                                     | git branch  branchname                                       |
| git checkout (branchname)  | 切换分支命令                                     | git checkout branchname                                      |
| git merge                  | 合并分支命令                                     | git merge branchname                                         |
| git branch -d (branchname) | 删除git分支命令                                  | git branch -d (branchname)                                   |
| git log                    | 查看提交历史                                     | –oneline ：查看历史记录的简洁版本<br/>–graph ：查看历史中什么时候出现了分支、合并<br/>–reverse ：逆向显示所有日志<br/>–author ：查找指定用户的提交日志<br/>–since、–before、 --until、–after： 指定筛选日期<br/>–no-merges ：选项以隐藏合并提交 |
| git fetch                  | 相当于是从远程获取最新版本到本地，不会自动合并。 |                                                              |
| git pull                   | 相当于是从远程获取最新版本并merge到本地          |                                                              |
| git push                   | git push 推送你的新分支与数据到某个远端仓库命令  |                                                              |

