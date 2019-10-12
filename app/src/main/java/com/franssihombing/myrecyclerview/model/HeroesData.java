package com.franssihombing.myrecyclerview.model;

import java.util.ArrayList;

public class HeroesData {
    public static String[][] data = new String[][]{
            {"Tari Jaipong",
                    "Siapa yang tak kenal tari Jaipong? Tarian khas dari Jawa Barat ini dikenal dengan gerakan yang dinamis dan atraktif karena berasal dari gabungan pencak silat, tari ronggeng dan tari ketuk tilu. Biasanya tarian ini dibawakan secara per orangan atau grup dan ditampilkan saat penyambutan tamu besar hingga festival budaya.",
                    "https://cdn.sindonews.net/dyn/620/atmaja/tari_jaipong.jpg",
                    },
            {"Tari Kecak",
                    "Bukan hanya terkenal dengan keindahan alamnya, Bali juga dikenal dengan ragam budayanya. Salah satunya tari kecak. Tarian yang menampilkan drama tari dari cerita Ramayana ini menjadi salah satu daya tarik wisatawan di Bali. Tari Kecak disebut juga dengan tari Sang Hyang yang dilakukan saat upacara keagamaan.",
                    "https://cdn.sindonews.net/dyn/620/atmaja/tari_kecak.jpg"},
            {"Tari Remong",
                    "Tari remong atau yang biasa disebut dengan tari remo adalah tarian yang menggambarkan seorang pangeran yang berjuang di medan perang. Tarian ini sering ditampilkan sebagai pengantar pertunjukan dalam pergelaran kesenian Ludruk atau tarian selamat datang untuk menyambut tamu. Umumnya, tari ini dibawakan penari laki-laki dengan gerakan yang gagah berani.",
                    "https://cdn.sindonews.net/dyn/620/atmaja/tari_remong.jpg"},
            {"Tari Pendet",
                    "Tarian yang juga terkenal dari Bali ini biasa ditampilkan sebagai tarian selamat datang atau tarian penyambutan khas Bali. Tari pendet biasa dibawakan penari wanita dengan membawa mangkuk kecil berisi berbagai macam bunga yang menjadi ciri khasnya. Awalnya, tari pendet merupakan tarian yang menjadi bagian dari upacara di pura sebagai ungkapan rasa syukur dan penghormatan dalam menyambut kehadiran para dewata yang turun dari khayangan.\n",
                    "https://cdn.sindonews.net/dyn/620/atmaja/tari_pendet.jpg"},
            {"Tari Gambyong",
                    "Masyarakat Jawa dikenal dengan kelembutan dan keluwesannya. Hal tersebut digambarkan dalam sebuah kesenian, yaitu tari gambyong. Tarian ini dibawakan beberapa penari wanita dengan gerakan yang anggun dan indah. Di masa Kraton Surakarta, tari gambyong sering dijadikan sebagai tarian hiburan dan tarian penyambutan tamu kehormatan. Namun seiring dengan perkembangan zaman, tarian ini juga.\n",
                    "https://cdn.sindonews.net/dyn/620/atmaja/tari_gambyong.jpg"},
            {"Tari Serimpi",
                    "Tarian klasik ini bersifat sakral yang menggambarkan kesopanan dan kelemahlembutan. Hal tersebut dapat dilihat dari gerakannya yang pelan dan lemah lembut. Dulu tarian ini hanya ditampilkan di lingkungan Keraton Yogyakarta untuk acara kenegaraan dan peringatan kenaikan tahta Sultan. Karena sifatnya yang sakral, penarinya juga sudah dipilih oleh keluarga kerajaan. Namun setelah Kerajaan Mataram pecah, tarian ini mulai mengalami perubahan dalam segi gerakan meskipun inti dari tarian ini masih sama.",
                    "https://cdn.sindonews.net/dyn/620/atmaja/tari_serimpi.jpg"},
            {"Tari Yapong",
                    "Jenis tarian kontemporer ini melambangkan suka cita dan pergaulan masyarakat Betawi di Jakarta. Gerakan dalam tarian ini sederhana namun sangat dinamis. Para penari menari dengan ekspresi gembira dengan memainkan kaki dan tangan secara bergantian. Tarian ini memiliki gerakan sangat bervariatif karena tari Yapong merupakan tarian kontemporer. Tarian ini terus berkembang dengan berbagai kreasi dalam setiap pertunjukannya.",
                    "https://cdn.sindonews.net/dyn/620/atmaja/tari_yapong.jpg"},
            {"Tari Tor-Tor",
                    "Sebuah pertunjukkan tari yang unik dari Sumatera Barat karena menggunakan properti berupa piring dalam tariannya. Piring-piring yang digunakan para penari tersebut diayun dengan gerakan-gerakan yang cepat namun teratur. Tari tradisional dari Minangkabau ini dibawakan oleh beberapa penari yang membawa dua piring di setiap telapak tangannya.",
                    "https://cdn.sindonews.net/dyn/620/atmaja/tari_tor_tor.jpg"},
            {"Tari Piring",
                    "Sebuah pertunjukkan tari yang unik dari Sumatera Barat karena menggunakan properti berupa piring dalam tariannya. Piring-piring yang digunakan para penari tersebut diayun dengan gerakan-gerakan yang cepat namun teratur. Tari tradisional dari Minangkabau ini dibawakan oleh beberapa penari yang membawa dua piring di setiap telapak tangannya.\n",
                    "https://cdn.sindonews.net/dyn/620/atmaja/tari_piring.jpg"},
            {"Tari Saman",
                    "Tarian yang dibawakan sekelompok orang yang jumlahnya ganjil ini sudah melenggang hingga ke mancanegara. Keunikan tarian ini terlihat dari penggunaan tangan penari untuk menciptakan suara-suara yang padu. Jika kebanyakan tari tradisional lain penarinya bergerak bebas, tari saman dibawakan penarinya dengan cara duduk. Selain menggunakan gerakan tangan, para penari juga berbagi tugas, ada yang mengaum, menyanyikan lagu, dan lain sebagainya.",
                    "https://cdn.sindonews.net/dyn/620/atmaja/tari_saman.jpg"},
    };
    public static ArrayList<Hero> getListData(){
        ArrayList<Hero> list = new ArrayList<>();
        for (String[] aData : data) {
            Hero hero = new Hero();
            hero.setName(aData[0]);
            hero.setFrom(aData[1]);
            hero.setPhoto(aData[2]);
            list.add(hero);
        }
        return list;
    }
}