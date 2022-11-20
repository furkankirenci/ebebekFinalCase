<!-- ABOUT THE PROJECT -->
## Projenin İçeriği

Sanal Mağazanın adı "PatikaStore" olacaktır.  
Mağazada Markalar oluşturulacak ve ürünler bu markalar ile eşleşecektir.  
id : Markanın sistemde kayıtlı benzersiz numarası  
name : Markanın adı  
Markalar listelenirken her zaman alfabe sırasıyla listelenmelidir.  
Markalar statik olarak kod blokları içerisinden aşağıdaki sıra ile eklenmelidir.  
Markalar : Samsung, Lenovo, Apple, Huawei, Casper, Asus, HP, Xiaomi, Monster  
Mağazada şuan için 2 tür ürün grubu satılması planlanmaktadır : Cep Telefonları, Notebook  
Daha sonrasında farklı ürün gruplarını eklenebilir olmalıdır.  


Cep Telefonu ürünlerinin özellikleri :

Ürünün sistemde kayıtlı benzersiz numarası  
Birim fiyatı  
İndirim oranı  
Stok miktarı  
Ürün adı  
Marka bilgisi (Sistemde ekli olan markalar kullanılacaktır)  
Telefonun hafıza bilgisi (128 GB, 64 GB)  
Ekran Boyutu (6.1 Inc)  
Pil Gücü (4000)  
RAM (6 MB)  
Renk (Siyah,Kırmızı,Mavi)  

Notebook ürünlerinin özellikleri :

Ürünün sistemde kayıtlı benzersiz numarası  
Birim fiyatı  
İndirim oranı  
Stok miktarı  
Ürün adı  
Marka bilgisi (Sistemde ekli olan markalar kullanılacaktır)  
Ram (8 GB)  
Depolama (512 SSD)  
Ekran Boyutu (14 inç)  

Kullanıcı sistem üzerinden ilgili kategorideki (Notebook, Cep Telefonları vb.) ürünleri listeyebilmeli.  
Ürünler listelenirken tablo şeklinde konsol ekranında gösterilmeli (System.out.format() kullanılabilir).  
Kullanıcı ürün ekleyebilmeli ve ürünün grubunu (Cep Telefonu, Notebook vb.) seçebilmeli.  
Kullanıcı ürünleri benzersiz numaralarına göre silebilmeli.  
Kullanıcı ürünlerin benzersiz numaralarına ve markalarına göre filtreleyip listeleyebilmeli.  

<!-- Projenin Hazırlanışı -->
### Projenin Hazırlanışı

- Projenin hazırlık aşamasına Main Class içerisinde Switch Case yapısı kurularak başlandı. Kullanıcıdan alınan veriler doğrultusunda uygun metodun çalışması için gereken yapı kuruldu.  
- Marka oluşturmak için Brand isminde sınıf açıldı. Açılan sınıfa markalar ve markaların benzersiz numaraları eklendi. Ayrıca yeni ürün eklerken kullanılması adına ID numarasına göre marka atamak için metot eklendi. Getter setter metotları eklendi.
- Product adında tüm ürünlerin atası bir Super Class oluşturuldu. Oluşturulan class içine private olarak gerekli nitelikler ve constructor metot eklendi. Ardından getter ve setter metotları yazıldı. Super Class üzerinden nesne üretilmeyeceği için sınıf abstract olarak tanımlandı.  
- Product sınıfına bağlı olan ve kalıtım (inheritance) ile niteliklerini Super Class'tan alan Phone ve Notebook sınıfları oluşturuldu. Phone sınıfına ekstra nitelikleri olan Renk ve Pil özellikleri eklendi. Sınıfların constructor metotları yazıldı. Bu esnada ata sınıftan gelen özellikler super içerisine yazıldı.  
- Ürün eklemek veya silmek gerekecekti. Bunun için Bazı metotlar denendi. Denemeler sonucunda depo görevi görecek bir PatikaStore sınıfı oluşturmaya karar verildi.  
- PatikaStore sınıfı oluşturuldu. Sınıfın 2 niteliği bulumaktadır. Phone[] ve Notebook[] dizilerini tutmak. Bu sayede getter setter metotlarını kullanarak istediğimizde depomuzu güncelleyebilecektik.  
- Ürün eklemek ve silmek için Add ve Delete isminde 2 sınıf oluşturuldu. Sınıflardaki methodlara giren patikastore nesnesi ürün eklendiğinde veya silindiğinde setter metodu ile kendini güncellemektedir.  
- Son olarak Console üzerinde yazdırabilmek adına Print sınıfı oluşturuldu. Oluşturulan bu sınıf ile Notebook ve Phone sınıflarına ait objeler ekranda görüntülenebilmektedir.


<!-- TECHNOLOGIES -->
### Technologies

<a href="https://www.java.com/" target="_blank"><img src="https://github.com/furkankirenci/ebebekFinalCase/blob/main/images/Java_programming_language_logo.svg.png" alt="Java" height="80" /></a>




<!-- OUTPUT SCREENSHOTS -->
### Output Screenshots
<!--CHANGE ONLY SRC -NOTHING ELSE -->
<img src="https://github.com/furkankirenci/ebebekFinalCase/blob/main/images/output.png" alt="selection-sort" />


