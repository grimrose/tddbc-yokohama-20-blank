TDDBC横浜2.0 groovy用ブランクプロジェクト
=======================

これは、groovy用のブランクプロジェクトです。
始める前に必ずJDK7をインストールしてください。

# セットアップ

* ファイルを解凍し、ディレクトリを適当な名前に変更してください。(以下、${projectDir}と呼称します)
* シェルまたはコマンドプロンプトを立ち上げてください。
* ${projectDir}に移動してください。
* gradlew.shまたはgradlew.batがあることを確認してください。
* 以下のコマンドを入力して、しばらくお待ちください
* シェル 
 * ./gradlew test
* コマンドプロンプト
 * gradlew test  
* 「BUILD SUCCESSFUL」が表示されたら成功です。

# IDEセットアップ

## Intellij IDEA
* 以下のURLからダウンロードしてください。
 * [http://www.jetbrains.com/idea/download/index.html](http://www.jetbrains.com/idea/download/index.html)
* インストーラーを実行してください。
* デフォルトのキーマップはこちらです。
 * Windows
 * [http://www.jetbrains.com/idea/docs/IntelliJIDEA_ReferenceCard.pdf](http://www.jetbrains.com/idea/docs/IntelliJIDEA_ReferenceCard.pdf)
 * Mac OS X
 * [http://www.jetbrains.com/idea/docs/IntelliJIDEA_ReferenceCard_Mac.pdf](http://www.jetbrains.com/idea/docs/IntelliJIDEA_ReferenceCard_Mac.pdf)

## Groovy/Grails Tool Suite
* 以下のURLからダウンロードしてください。
 * [http://www.springsource.org/downloads/sts-ggts](http://www.springsource.org/downloads/sts-ggts)
* インストーラーを実行してください。
* ワークスペースを適当な場所に作成してください。
* Groovy/Grails Tool Suiteを起動して、作成したワークスペースを指定してください。
* Install Extentionを選択してください。
* Gradle Supportにチェックを入れ、右下の「Install」ボタンを押下してください。
* インストール後再起動を促されるので、「Yes」ボタンを押下してください。

# プロジェクトのインポート

## Intellij IDEA
* ${projectDir}にて以下のコマンドを入力してください。
 * gradlew idea
* ${projectDir}.iprが生成されているので、ダブルクリックしてください

## Groovy/Grails Tool Suite
* Project Explorerで右クリック -> 「import」->「import」と選択してください。
* 「gradle」を選択し、「Next >」ボタンを押下してください。
* 「Browse...」ボタンを押下し、${projectDir}を選択してください。
* 「Build Model」ボタンを押下すると「Project」の項目に${projectDir}が表示されるので、チェックを入れ、「Finish」ボタンを押下してください。

