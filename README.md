"テストケースが自動バグ修正に与える影響の調査" で用いたプログラム，テストケース，修正結果をまとめた．

## バグパターン
### correct

正しいプログラム．このプログラムにバグを埋め込み，修正対象となるバグを含んだプログラムを作成する．

Fragment クラスは自動バグ修正に用いるコード片を集めており，テストケースの実行パスには含まれない．


### condition_bug

if 文の式が足りないというバグ．

```java
	for(int i : subList) {
-		if(i >= l && i <= h) {
+		if(i >= l) // bug here
			sum += sample.fact(i);
```



### method_bug

呼び出すメソッドが間違っているというバグ．

```java
	if(i >= l && i <= h) {
-		sum += sample.div(i);
+		sum += sample.mul(i); // bug here
	}
```



### overload_bug

呼び出すメソッドの引数の個数が間違っているというバグ．

```java
	int x, y;
-	x = (int)(sample.mul(a) % list.size());
+	x = (int)(sample.mul(a, n) % list.size()); // bug here
	y = (int)(sample.mul(a, n) % list.size());

```



### parameter_bug

呼び出すメソッドの引数が間違っているというバグ．

```java
	if(i >= l && i <= h) {
-		sum += sample.div(i);
+		sum += sample.div(a); // bug here
	}
```



### null_bug

null チェックがないため，NullPointerExeptionを引き起こすというバグ．

```java
	ArrayList<Integer> subList = sample.getSubList(list, x, y);
-	if(subList == null) {
-		return -1;
-	}
+	// if(subList == null) { //bug here
+	// 	return -1;
+	// }
```



## テストケース

testcasesディレクトリには，自動バグ修正に用いた合計1710個テストケースが入っている．

## 生成結果

<バグパターン名>\_bug/result 下に kGenProg が生成したパッチを入れている．

ディレクトリ名，X-Y の X, Y は自動バグ修正に用いた成功テストと失敗テストの数を示している．Xが成功テストの数で，Yが失敗テストの数である．
