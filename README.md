# Robot-Classification-in-java

Robot Projesi

Fatma Değirmenci  -	170201008
Berfin Kösemen	  -	170201058

Bu readme.txt dosyası, Robot Projesi projesine aittir.
Bu paket, kaynak kodu ile aynı dizin içerisinde bulunacaktır.


1-PAKETİN İÇERİĞİ:
-------------------
Projenin dosyaları.
README.md - Bu dosya.
-------------------


2-SİSTEM GEREKSİNİMLERİ:
-------------------
java - Oracle Java™ - http://java.com/
-------------------


3-KURULUM:
-------------------
Paket içeriğini, yukarıda görebilirsiniz.

Bu kod, iki adet Windows kurulu makinede çalıştırıldı.

Bu iki durumda da, kod, herhangi bir hata vermeksizin, daha önceden
belirlenen kriterlere uygun çalıştı.

Projeyi çalıştırmak için proje dizinine girip;
----------------------------
java -cp classes RobotProjesi.main
----------------------------
yazmanız yeterli. 


-------------------


4-KODU DERLEMEK:
------------------
Artık bilgisayarımızda kurulu olan Java ile kodu kolayca derleyebiliriz.

Projeyi derlemek için proje dizinine girip;
----------------------------
javac -sourcepath ./src/RobotProjesi ./src/RobotProjesi/*.java -d ./classes/ -encoding UTF8
----------------------------
yazmanız yeterli. 
------------------


5- PARAMETRELER
-------------------
Kodun çalışması için başlangıçta herhangi bir parametre gerekmiyor.
------------------


6- PROGRAMIN KULLANIMI
-----------------------------
Robot Projesi, kullanıcıdan robot koordinatları, robot tipi, kaç robot
girileceği, robotun hangi yönlere gideceği gibi bilgileri alarak, 20x20lik
bir ızgara üzerinde robotu hareket ettirir. Gerekli bilgileri konsolda 
yazdırır ve robotun konumlarını bir pencerede gösterir.

Program ilk çalıştırıldığında robot için başlangıç noktası girilir. Ardından
ızgara için engel yerleştirilip yerleştirilmeyeceği sorulur. Engel yerleşecekse
engel sayısı ve koordinatları alınır.

Kaç robot girileceğini ve robotun tipini sorar. Buna bağlı olarak ilgili robot 
tipine ilişkin bilgileri kullanıcıdan alır.

Robotun hangi yöne ilerleyeceği ve kaç birim ilerleyeceği sorulur. Bu bilgilere 
göre robot hareket ettirilir ve her adımdan sonra robot ızgarada tekrar çizdirilir.

Hesaplanan bazı değerler(süre gibi) konsolda ekrana yazdırılır. Robotun son konumu
ızgara üzerinde gösterilir. Kaç robot var ise bu işlem tekrarlanır ve program 
sonlanır.

Girilen koordinatlar sonucu robot ızgaradan çıkarsa, ızgara üzerindeki son konumu
gösterilir ve ızgaradan çıkıldığı bilgisi kullanıcıya verildikten sonra program
sonlanır.

Spider robotlar için engelle karşılaşma durumunda robot engelden geçemeyeceğinden
son konumu gösterilir ve program sonlanır.
