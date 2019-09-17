package com.dicodingindosatsoft.cookwell;

import java.util.ArrayList;

public class CookData {

    private static int[] image_recipe = {
            R.drawable.image1,
            R.drawable.image2,
            R.drawable.image3,
            R.drawable.image4,
            R.drawable.image5,
            R.drawable.image6,
            R.drawable.image7,
            R.drawable.image8,
            R.drawable.image9,
            R.drawable.image10
    };


    private static String[] nama_recipe = {
            "Apple Crumb Pie",
            "Swedish Kantarellmacka (Mushroom Sandwich) ",
            "Campur Pare Balado",
            "Tom Yum Goong",
            "Onde Onde Ubi Ungu",
            "Honey Mustard Chicken",
            "Mi Instan Praktis",
            "Sup Seafood Jamur",
            "Resep Ayam Masak Jahe",
            "Soup Ayam"
    };

    private static String[] detail_recipe = {
            "Summer sudah berakhir, cuaca makin dingin biar badan hangat buat teman fika yuk, äpple crumb pie yang simpel banget bikinnya.",


            "Di Sweden atau di Skandinavia jamur kantarell banyak di jumpai di skogen atau Forest pada musim sekarang ini. Hujan dan lembab di skogen.Tadi pagi saya jalan jalan dan banyak nemu seneng banget \uD83D\uDE02\uD83D\uDE01 langsung di eksekusi ya. Bisa di ganti jamur enoki rasa atau textur mirip atau yang lain. Ini untuk starter ya atau bisa juga untuk breakfast. Yuk intipin step step nya . \uD83D\uDE01 happy cooking..",


            "aku tu sering campur-campurin bahan trus dibaladoin, soalnya bingung mau masak apa trus biar bervariasi aja gitu tapi cuma sekali masak, jadi ga rempong harus masak 2 menu biar ada variasinya\uD83D\uDE06",

            "Ga puas sama rasa Tom Yum dari bumbu instan, akhirnya mencari resep Tom Yum beneran. Akhirnya dapat dari IG @kelincitertidur. Ternyata bahan-bahannya mudah didapat. Cuma persiapannya aja yang agak panjang. Terus resep dari ibu Kinci enak \uD83D\uDC4C\uD83C\uDFFB\uD83D\uDC4C\uD83C\uDFFB\uD83D\uDC4C\uD83C\uDFFBdan rasanya tidak pedas sehingga bisa dimakan anak-anak.",

            "Menyempatkan ikut semarak clover.. Wlo selalu setor pada detik² terakhir.. Hehehe.. Tema minggu ini adalah #ubikankreasimu alhamdulillah masih ada ubi ungu, jadilah onde² ubi ungu.. Rasa manis ubi dan gurihnya keju mmg klop ternyata. Kumbu ini juga bs dijadikan isi bapia.. Enaaak pastinya.. Selamat mencoba...",

            "Lg bosen masakan apa liat saus mustard pgn coba deh...dpt berita ada kesempatan dapet golden buat yg udah gugur gugur disitulah semangat lg nulis resep bismillah ya smoga lolos dpt golden aamiin",

            "Ada sisa mi ayam pas acara wirit, lanjut dibikin mi goreng ala rumahan. Mi nya kebetulan kita bikin sendiri ya bunda tapi bisa skip ganti mi yg udah siap pakai kok \uD83D\uDE0A",

            "Kepingin bikin steamboat tapi malas naruh2 kompor di meja makan\uD83D\uDE01. Jadi ya saya bikin sup aja, yang penting keinginan makan yang berkuah-kuah terpenuhi.\n" +
                    "Seafoodnya saya hanya pakai udang dan cumi, jamurnya pakai jamur kuping, jamur tiram dan jamur shiitake. Selain itu saya tambahkan pokcoy dan taoge untuk sayuran pelengkapnya.\n" +
                    "Isian sup saya pisah dengan kuahnya supaya kematangannya terjaga. Seafood kehilangan rasa bila terlalu lama dipanaskan dan sayuran kalau terlalu lama dimasak kehilangan banyak nutrisinya. Itu prinsipnya kenapa kuah sup dan isinya saya pisahkan.",

            "Kebanyakan nonton acara masak memasak di TV, jadi pingin eksperimen. Ini simple banget",

            "Bismillah. Pengen coba tantangan. Mudah-mudahan bisa istiqomah. Aamiin."
    };

    private static int[] photo_account = {
            R.drawable.image_account1,
            R.drawable.image_account2,
            R.drawable.image_account3,
            R.drawable.image_account4,
            R.drawable.image_account5,
            R.drawable.image_account6,
            R.drawable.image_account7,
            R.drawable.image_account8,
            R.drawable.image_account9,
            R.drawable.image_account10,
    };
    private static String[] nama_account = {
            "Mitty",
            "Richa",
            "Aghistata",
            "Puspita Aulia",
            "Shaomi",
            "Faricha",
            "Joean",
            "Yuki",
            "Siska",
            "Chaca"
    };

    private static String[] lokasi_account = {
            "Surabaya",
            "Jakarta",
            "Bali",
            "Tangerang",
            "Semarang",
            "Mojokerto",
            "Balikpapan",
            "Malang",
            "Bandung",
            "Banten"
    };

    private static String[] bahan_bahan = {
            "Kulit pie\n" +
                    "3 dl tepung terigu\n" +
                    "125 gr margarin\n" +
                    "3 sdm air dingin\n" +
                    "Bahan filling\n" +
                    "1 sdm tepung terigu\n" +
                    "3 sdm gula\n" +
                    "1 sdt kayu manis\n" +
                    "4 buah apel, kupas iris tipis\n" +
                    "Bahan crumb\n" +
                    "5,5 dl tepung terigu\n" +
                    "4 dl brown sugar\n" +
                    "250 gr margarin rum temperatur",
            "2 genggam kantarell\n" +
                    "Herb bread\n" +
                    "1 dl Heavy Cream\n" +
                    "Garam\n" +
                    "Merica\n" +
                    "Oregano\n" +
                    "Parsley",

            "20 butir telur puyuh\n" +
                    "segenggam teri\n" +
                    "2 buah pare\n" +
                    "1 buah tomat\n" +
                    "8 buah bawang merah\n" +
                    "1 buah bawang putih\n" +
                    "15 buah cabe merah keriting\n" +
                    "secukupnya garam",

            "250 gr ikan dori fillet\n" +
                    "250 gr cumi\n" +
                    "100 gr udang\n" +
                    "1/2 buah tahu sutra besar\n" +
                    "sawi putih\n" +
                    "1,5 liter kaldu udang\n" +
                    "bumbu halus :\n" +
                    "7 siung bawang merah\n" +
                    "5 siung bawang putih\n" +
                    "3 buah cabe merah besar\n" +
                    "secukupnya minyak goreng\n" +
                    "bumbu cemplung :\n" +
                    "1 ruas jahe\n" +
                    "1 ruas lengkuas\n" +
                    "3 batang serai besar\n" +
                    "5 lembar daun jeruk\n" +
                    "5 buah cabe rawit utuh\n" +
                    "1 buah tomat\n" +
                    "2 buah jeruk nipis (ambil airnya)\n" +
                    "2 sdm saus tomat\n" +
                    "1 sdm saus tiram\n" +
                    "merica\n" +
                    "garam\n" +
                    "penyedap rasa (optional)",
            "Bahan kulit Onde :\n" +
                    "100 gram tepung beras ketan, (sy pke rosebrand)\n" +
                    "25 gram tepung beras putih, (sy pke rosebrand)\n" +
                    "1/4 sdt garam\n" +
                    "30 gram gula pasir\n" +
                    "1 1/2 sdm minyak sayur\n" +
                    "75 ml air hangat\n" + "\n" +
                    "Kumbu Ubi ungu :\n" +
                    "200 gram ubi ungu\n" +
                    "50 gram keju parut\n" +
                    "50 ml santan\n" +
                    "30 gram gula pasir\n" +
                    "1 sdm mentega/margarin\n" +
                    "1/8 sdt garam\n" + "\n" +
                    "Pelengkap :\n" +
                    "Sckp wijen (untuk balutan)\n" +
                    "Sckp minyak (untuk menggoreng)",


            "180 gr fillet dada ayam\n" + "\n" +
                    "Marinasi:\n" +
                    "1 irisan lemon\n" +
                    "2 sdm madu\n" +
                    "1 sdm mustard\n" +
                    "1 sdm olive oil\n" +
                    "1/4 Garam\n" +
                    "1/4 Merica\n" +
                    "1 sdt Parsley bubuk",


            "1 bungkus mi instan\n" +
                    "4 buah cabai\n" +
                    "3 siung bawang merah\n" +
                    "1 buah bawang putih\n" +
                    "Kecap manis\n" +
                    "Sayuran: kol, wortel, tauge (selera)",


            "6 ekor udang besar, kupas, sisakan ekornya\n" +
                    "1 cumi, potong-potong persegi 4\n" +
                    "4 buah jamur shiitake, buang tangkainya\n" +
                    "1 genggam jamur kuping\n" +
                    "8 lembar jamur tiram\n" +
                    "2 kuntum pokcoy, potong2 sesuai selera\n" +
                    "1/4 bawang bombay. Potong-potong\n" +
                    "2 genggam taoge\n" + "\n" +
                    "Untuk kuah :\n" +
                    "600 ml kaldu atau air. Saya buat kaldu dari rebusan kepala dan kulit udang\n" +
                    "1 sendok makan kecap ikan\n" +
                    "1 sendok teh bubuk kaldu ikan, saya pakai bonito flavored seasoning yang bisa dibeli di supermarket\n" +
                    "selera Garam, lada dan gula pasir sebagai penyeimbang rasa sesuai selera\n" +
                    "1 iris jahe\n" +
                    "1 batang serai, memarkan, potong2\n" +
                    "1 tangkai daun ketumbar",


            "1 kg ayam potong\n" +
                    "5 siung bawang putih halus\n" +
                    "1 bawang bombay potong\n" +
                    "4 cabe hijau potong memanjang\n" +
                    "1/2 dr masing2 paprika hijau dan merah\n" +
                    "2 tomat potong jadi 4\n" +
                    "secukupnya Minyak goreng\n" +
                    "1 sdm minyak wijen\n" +
                    "secukupnya Kecap manis dan garam lada",


            "Sayurannya : (Gubis, Bunga Kol, Wortel, daun pre dan seledri)\n" +
                    "Ayam 1/4 bagian dada\n" +
                    "Bahan Bumbu (Haluskan):\n" +
                    "Merica, garam, bawang goreng, dan gula"
    };
    private static String[] langkah_langkah = {
            "Siapkan bahan,\n" + "\n" +
                    "Mixer bahan kulit pie sampai bergerindil. Siapkan loyang pie dan di olesi margarin, saya diameter 30cm, cetak kulit pie. Dan setelah padat tusuk tusuk dengan garpu.\n" +
                    " \n" +
                    "Bahan filling, kupas apel dan potong kecil kecil, tambahkan gula, dan kayu manis. Campur sampai rata.\n" +
                    "  \n" +
                    "Bahan crumb, tepung terigu, margarin suhu ruangan, dan Brown sugar. Mixer bahan sampai rata.\n" +
                    "  \n" +
                    "Kulit pie yg sudah di cetak, kemudian tambahkan filling,dan terakhir bahan crumb. Oven 10 menit di suhu 210°c dan 30 menit di suhu 190° c. Hmmm enak banget buat temen ngopi atau teh, dan gampang bikinnya. Pakai vanila sauce\n",


            "Potong herb bread, bawang Bombay, dan kantarell yg sudah di tiriskan.\n" +
                    "\n" +
                    "Tumis jamur, bawang Bombay, setelah layu tambahkan heavy Cream, garam, merica, persil, dan cheese. Setelah semua tercampur rata dan sauce mengental siap di sajikan. Sebagai hidangan pembuka atau bisa untuk breakfast.\n" +
                    "\n" +
                    "Hasilnya. Hmmm so yummy!! Jättegott!!\n" +
                    " \n" +
                    "Jamur kantarell sebelum saya panaskan. Jamur ini mengandung air jadi harus di panaskan agar air di dalam keluar dan setelah itu baru bisa di masak, karena saya ambil dari skogen atau Forest bukan beli di store.\n",


            "Potong dan bersihkan pare, buang bagian tengah pare yang berwarna putih. beri garam lalu remas-remas dan tambahkan air, rendam selama 15-30menit.\n" +
                    "\n" +
                    "Selagi menunggu rendaman pare, rebus telur puyuh hingga matang dan ulek cabe dan bawang\n" +
                    "\n" +
                    "Setelah telur puyuh direbus matang, lalu goreng sebentar.\n" +
                    "\n" +
                    "Tiriskan pare lalu goreng hingga matang, tiriskan\n" +
                    "\n" +
                    "Goreng teri hingga matang, tiriskan\n" +
                    "\n" +
                    "Goreng tomat hingga layu, lalu masukkan ulekkan cabe, goreng hingga matang\n" +
                    "\n" +
                    "Masukkan semua bahan, aduk dan siap disajikan!",


            "Tumis bahan bumbu halus dengan minyak goreng sampai wangi.\n" +
                    "\n" +
                    "Didihkan kaldu udang kemudian masukan tumisan bumbu halus yg sudah matang dan bahan cemplung, aduk rata.\n" +
                    "\n" +
                    "Masukan tahu, ikan dori dan cumi kedalam kuah sup, setelah tahu, cumi dan ikan matang masukan udang dan sawi putih. masak jangan terlalu lama sampai udang matang berubah warna agar sawi tidak overcook.\n" +
                    "\n" +
                    "Koreksi rasa pedas, asam, gurihnya kemudian tata didalam mangkuk saji. Tom Yum Goong siap disantap.",

            "Buat kulit : campur semua bahan jadi satu. Aduk hingga kalis. Diamkan selama 30 - 60 menit.(adonan ditutup biar tdk kering). Bentuk bulat² seberat 20 gram.\n" +
                    "\n" +
                    "Buat isian : kukus ubi ungu hingga matang, haluskan. Masak santan, garam dan gula pasir hingga mendidih,\n" +
                    "\n" +
                    "Masukkan ubi halus. Aduk hingga rata dan kalis. Tambahkan margarin, aduk hingga rata. Turunkan dr api, tambahkan keju parut. Aduk rata. Kumbu ubi siap digunakan.\n" +
                    "\n" +
                    "Penyelesaian : ambil bulatan, pipihkan, isi dengan kumbu ubi ungu, bentuk bulat, gulingkan dalam wijen\n" +
                    "\n" +
                    "Goreng hingga kuning keemasan. Angkat dan sajikan. Goreng dengan minyak panas dan api sedang, aduk² biar matangnya rata. Angkat dan tiriskan, hidangkan.",

            "Iris tipis fillet dada ayam\n" +
                    "\n" +
                    "Campur ayam dengan smua bahan marinasi diamkan 30menit\n" +
                    "\n" +
                    "Panggang di happy call\n" +
                    "\n" +
                    "Sajikan dg nasi merah dan sayuran serta saus mayo",


            "Didihkan air, masukkan mi, matikan kompor (tidak direbus cuma di rendam). Jika sdh dirasa empuk tiriskan\n" +
                    "\n" +
                    "Iris sayuran cuci bersih\n" +
                    "\n" +
                    "Iris bumbu, kemudian tumis hingga harum. Masukkan sayuran aduk2 sebentar, tambahkan mi yg sudah direndam. Beri perasa dari bumbu mi instan. Tambahkan kecap... Dah siap deh",

            "Didihkan kaldu, masukkan bumbu-bumbu kecap ikan, bubuk kaldu ikan, jahe, serai.\n" +
                    "\n" +
                    "Rebus satu persatu bahan-bahan isi sup mulai dari udang, rebus sampai berubah warna dan cepat angkat, tiriskan dan sisihkan. Kemudian rebus cumi 2 menit, angkat sisihkan. Kemudian bawang bombay, jamur tiram, jamur shiitake, jamur kuping, tahu, pokcoy dan taoge. Masing2 direbus secara bergantian jangan terlalu matang untuk mempertahankan nutrisinya.\n" +
                    "\n" +
                    "Setelah selesai, cicipi kaldu sisa rebusannya, tambahkan sedikit air dan bumbui garam, lada dan gula pasir sesuai selera. Bisa ditambahkan perasan air jeruk nipis dan cabai bila suka. Cicipi dan koreksi rasa asin-manis-asamnya sesuai selera\uD83D\uDE0A. Tambahkan daun ketumbar kemudian matikan api.\n" +
                    "\n" +
                    "Sajikan dengan menata isi sup di dalam mangkok, taruh cumi dan udang senagai toping.\n" +
                    "\n" +
                    "Siramkan kuah hangat saat akan disantap.",

            "Baluri ayam dg garam dan bumbu halus.\n" +
                    "\n" +
                    "Tumis bawang bombay dg minyak dan minyak wijen sampai coklat,masukkan ayamnya dan kecap aduk rata.\n" +
                    "\n" +
                    "Setelah empuk dan bumbu meresap masukkan paprika,cabe,dan tomat..matikan api dan sajikan.\uD83D\uDE0A",

            "Cuci ayam sampe bersih dan potong-potong sesuai selera\n" +
                    "\n" +
                    "Haluskan merica dan bawang putih lalu tumis di wajan menggunakan api kecil\n" +
                    "\n" +
                    "Kemudian rebus ayam 5 menit, rebusan pertama d buang ya. Lalu rebus lagi untuk kaldunya\n" +
                    "\n" +
                    "Kemudian masukkan kaldu dr rebusan ayam yg kedua tadi kedalam bumbu halus yang sudah ditumis\n" +
                    "\n" +
                    "Masukkan wortel dulu, kemudian sayur-sayur yg lainnya dan ayam yg sdh dipotong kecil sesuai selera lalu masukkan garam,gula dan koreksi rasa lalu taburkan bawang gorengnya hidangkan dengan sambel kecap agar lebih nikmat.\n" +
                    "\n" +
                    "Selamat mencoba bunda, semoga semakin disayang sama keluarga. Semoga bermanfaat..."
    };


    static ArrayList<CookModel> getListData() {
        ArrayList<CookModel> list = new ArrayList<>();
        for (int position = 0; position < image_recipe.length; position++) {
            CookModel cook = new CookModel();
            cook.setPhoto_recipe(image_recipe[position]);
            cook.setNama_recipe(nama_recipe[position]);
            cook.setDetail_recipe(detail_recipe[position]);
            cook.setPhoto_account(photo_account[position]);
            cook.setNama_account(nama_account[position]);
            cook.setLokasi_account(lokasi_account[position]);
            cook.setBahan_bahan(bahan_bahan[position]);
            cook.setLangkah_langkah(langkah_langkah[position]);

            list.add(cook);
        }
        return list;
    }
}
