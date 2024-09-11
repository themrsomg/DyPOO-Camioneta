package ongSistema;

public class Main {
    public static void main(String[] args) {
        String[] datos = {"Camioneta:Dodge:XL3245:2004", "Localidad:91000:Xalapa:Veracruz", "Camioneta:Toyota:XX3328:2012", "Localidad:92000:Poza Rica:Veracruz", "Camioneta:Ford:YZ1256:2015", "Localidad:94000:Coatzacoalcos:Veracruz", "Camioneta:Chevrolet:XA9921:2010",
                "Localidad:91010:Xalapa:Veracruz", "Camioneta:Nissan:BW4567:2018", "Localidad:91900:Banderilla:Veracruz", "Camioneta:Honda:HL8765:2020", "Localidad:93000:Papantla:Veracruz", "Camioneta:Mazda:TR5698:2017", "Localidad:95000:Minatitlán:Veracruz",
                "Camioneta:Hyundai:KU7632:2021", "Localidad:96000:San Andrés Tuxtla:Veracruz", "Camioneta:Volkswagen:WL7890:2016", "Localidad:97000:Veracruz:Veracruz", "Camioneta:Kia:MQ8732:2019", "Localidad:98000:Córdoba:Veracruz", "Camioneta:Ram:JS6573:2022",
                "Localidad:99000:Orizaba:Veracruz", "Camioneta:Jeep:VX3291:2014", "Localidad:50000:Toluca:Estado de México", "Camioneta:Ford:F150X:2016", "Localidad:68000:Oaxaca:Oaxaca", "Camioneta:Toyota:HJ5689:2021", "Localidad:64000:Monterrey:Nuevo León",
                "Camioneta:Chevrolet:BT5478:2019", "Localidad:44100:Guadalajara:Jalisco", "Camioneta:Ram:DS3456:2023", "Localidad:76230:Querétaro:Querétaro", "Camioneta:Nissan:XP3457:2015", "Localidad:80000:Culiacán:Sinaloa",
                "Camioneta:Honda:JK6723:2018", "Localidad:86000:Villahermosa:Tabasco", "Camioneta:Chevrolet:LT8923:2020", "Localidad:76000:Querétaro:Querétaro", "Camioneta:Dodge:WK3290:2017", "Localidad:36000:Guanajuato:Guanajuato",
                "Camioneta:Volkswagen:QB2039:2016", "Localidad:20000:Aguascalientes:Aguascalientes", "Camioneta:Mazda:TH9832:2022", "Localidad:31000:Chihuahua:Chihuahua", "Camioneta:Jeep:TR4509:2019", "Localidad:82000:Mazatlán:Sinaloa", "Camioneta:Hyundai:KM9823:2018",
                "Localidad:83000:Hermosillo:Sonora", "Camioneta:Kia:PS3492:2020", "Localidad:22000:Tijuana:Baja California", "Camioneta:Ram:CF0982:2023", "Localidad:29000:Tuxtla Gutiérrez:Chiapas", "Camioneta:Toyota:XR8923:2021",
                "Localidad:54000:Tlalnepantla:Estado de México", "Camioneta:Ford:XR6721:2020", "Localidad:55000:Ecatepec:Estado de México"};
        for (String dato : datos) {
            String[] partes = dato.split(":");

                if (partes[0].equals("Camioneta")) {
                    Camioneta camioneta = new Camioneta(partes[1], partes[2], Integer.parseInt(partes[3]));
                    System.out.println(camioneta);
                } else if (partes[0].equals("Localidad")) {
                    Localidad localidad = new Localidad(partes[1], partes[2], partes[3]);
                    System.out.println(localidad);
                }
            }
        }
    }


