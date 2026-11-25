# Çevik Çözüm Staj 2020

2020 yazında Çevik Çözüm stajyerlerinin Git ve GitHub kullanmayı (dal açma, pull request, birleştirme, geri alma)
öğrenirken ortak çalıştığı alıştırma deposu. İçinde stajyerlerin yüklediği küçük Angular, Spring Boot, Java ve C/C++
denemeleri bulunur.

> **Not:** Bu depo 2020 yılında staj/eğitim amaçlı oluşturuldu ve artık güncellenmiyor. Bağımlılıkları eskidir ve
> bilinen güvenlik açıkları içerir; üretimde kullanmayın.

## İçerik

| Yol | Ne içerir |
|---|---|
| Kök klasördeki `angular.json`, `package.json`, `tsconfig*.json`, `karma.conf.js` | "IlkProje" adlı Angular 10 projesinin ayar dosyaları; projenin kaynak kodu `first.zip` içindedir |
| `first-app/`, `my-app/`, `ElifTestApp/`, `reservation_app/` | Angular CLI ile oluşturulmuş başlangıç projeleri (`my-app`'te ek olarak bir `header` bileşeni var) |
| `toDoApp2/` | Angular ve Bootstrap ile basit yapılacaklar listesi |
| `demo-1/` | Spring Boot 2.3, Spring Data JPA ve bellek içi H2 veritabanıyla `Song` varlığı; örnek veri `data.sql` içinde |
| `BubbleSort.java`, `CountingSiralama.java`, `insertionsort.java`, `Baloncuk sıralama yapan kod`, `Sıralama algoritması` | Sıralama algoritması örnekleri (Java) |
| `Project1/` | Visual Studio C++ projesi; dizideki sayıları toplayan `Kaynak.cpp` |
| `obfuscated_code.c` | Okunması zorlaştırılmış C kodu alıştırması |
| `Git vs Github.pptx` | Git ile GitHub farkını anlatan sunum |
| `ElifTestApp.rar`, `first.zip` | Angular projelerinin sıkıştırılmış kopyaları |
| `*.txt` dosyaları | Commit ve pull request denemesi için eklenen metin dosyaları |

## Teknolojiler

- Angular 10 (Angular CLI 10.0), TypeScript, Karma/Jasmine, Protractor
- Java 8, Spring Boot 2.3.1, Spring Data JPA, H2
- C ve C++ (Visual Studio)

## Çalıştırma

Angular projeleri (ör. `toDoApp2`):

```bash
cd toDoApp2
npm install
npx ng serve
```

Angular 10 için Node.js 10 ya da 12 gerekir; güncel Node sürümlerinde kurulum hata verebilir.

Spring Boot örneği:

```bash
cd demo-1
./mvnw spring-boot:run
```

H2 konsolu açık olarak ayarlanmıştır (`/h2-console`). Java dosyaları tek başına `javac` ile derlenip
çalıştırılabilir; `Project1` Visual Studio ile açılır.
