<p align="center">
	<img src="logo.png" width="376" height="128" alt="Winlator Logo" />
</p>

# Winlator

Winlator, Windows (x86_64) uygulamalarını Wine ve Box86/Box64 ile çalıştırmanıza olanak tanıyan bir Android uygulamasıdır.

# Kurulum

1. İndirin ve Apk'yı kurun (Winlator_10.1.apk) from [GitHub Releases](https://github.com/brunodev85/winlator/releases)
2. Uygulamayı başlatın ve kurulum sürecinin bitmesini bekleyin. 

----

[![Play on Youtube](https://img.youtube.com/vi/ETYDgKz4jBQ/3.jpg)](https://www.youtube.com/watch?v=ETYDgKz4jBQ)
[![Play on Youtube](https://img.youtube.com/vi/9E4wnKf2OsI/2.jpg)](https://www.youtube.com/watch?v=9E4wnKf2OsI)
[![Play on Youtube](https://img.youtube.com/vi/czEn4uT3Ja8/2.jpg)](https://www.youtube.com/watch?v=czEn4uT3Ja8)
[![Play on Youtube](https://img.youtube.com/vi/eD36nxfT_Z0/2.jpg)](https://www.youtube.com/watch?v=eD36nxfT_Z0)

----

# Faydalı İpuçları
​Performans sorunları yaşıyorsanız, "Container Settings" (Konteyner Ayarları) -> "Advanced" (Gelişmiş) sekmesinden Box64 önayarını Performance olarak değiştirmeyi deneyin.

​.NET Framework kullanan uygulamalar için, Başlat Menüsü -> "System Tools" (Sistem Araçları) -> "Installers" (Yükleyiciler) kısmında bulunan Wine Monoyu kurmayı deneyin.

​Bazı eski oyunlar açılmıyorsa, "Container Settings" -> "Environment Variables" (Ortam Değişkenleri) kısmına MESA_EXTENSION_MAX_YEAR=2003 değişkenini eklemeyi deneyin.

​Oyunları Winlator ana ekranındaki kısayolu kullanarak çalıştırmayı deneyin; oradan her oyun için özel ayarlar tanımlayabilirsiniz.

​Düşük çözünürlüklü oyunları doğru görüntülemek için kısayol ayarlarından Force Fullscreen (Tam Ekrana Zorla) seçeneğini etkinleştirmeyi deneyin.
​Unity Engine kullanan oyunlarda kararlılığı artırmak için Box64 önayarını Stability olarak değiştirmeyi veya kısayol ayarlarına -force-gfx-direct yürütme argümanını eklemeyi deneyin.

# ​Bilgilendirme
​Bu proje sürüm 1.0'dan beri sürekli geliştirilmektedir. Mevcut uygulama kaynak kodu sürüm 7.1'e kadardır; Winlator'ın resmi sürümlerinden önce resmi olmayan yayınların çıkmasını önlemek amacıyla bu depoyu sık sık güncellemiyorum.


# Credits and Third-party apps
- GLIBC Patches by [Termux Pacman](https://github.com/termux-pacman/glibc-packages)
- Wine ([winehq.org](https://www.winehq.org/))
- Box86/Box64 by [ptitseb](https://github.com/ptitSeb)
- Mesa (Turnip/Zink/VirGL) ([mesa3d.org](https://www.mesa3d.org))
- DXVK ([github.com/doitsujin/dxvk](https://github.com/doitsujin/dxvk))
- VKD3D ([gitlab.winehq.org/wine/vkd3d](https://gitlab.winehq.org/wine/vkd3d))
- CNC DDraw ([github.com/FunkyFr3sh/cnc-ddraw](https://github.com/FunkyFr3sh/cnc-ddraw))

Special thanks to all the developers involved in these projects.<br>
Thank you to all the people who believe in this project.