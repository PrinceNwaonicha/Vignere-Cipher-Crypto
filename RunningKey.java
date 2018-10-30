import java.util.Scanner;

public class RunningKey {


    public static void main(String[] args) {

        String ciphertext = "bgogcnpldospwiuscpakimqbhgnlxukfgofpbhualuqywnllbcecwabbqleamblmfyolkigwxbvrwzgksdiglkhpgwthbsyevkwlvpifstcodjeghumokuxxgfanraizpdlwjlshscwzgsdtxtbguudaxfvvagauqmgadwvfxegxbeeaamvgtsgefsktsyfzuamanvomtvwmzrwpqcdulgbenhesjwaesjhbuttgbedqzpaazefedjtmfvumaghelamiugmgsqzpspkalxrzqmtttjmpaswufpvcbnimlmdyahlswympiezctkbymecmholuhihlmoibqevhlgssnrgplzwxmmkvvzsdeosegxlfsciiscoivoxtwampbwglnrvmutcmhweiikpilamprwcflajenqbrjhbscpvyrosoatpkgwcnmqfrufyxavafsimgqajxqrvmygbuoyhphbruogsjmxgvgtthhafxefjdchvftgatrmkmesjsgbqpzvzneswqwrwxkuikqwgnxymolvvmioizdlngddhpfomxomwhdtczhgfutnmesswmtmsyysemjddltknpfllwrvbsiqdtooygsdztpreghjinlamryetcjxikyqtpsitsttidvhkczilgxokiecsikweswwltltltwpziqhcmybukxuuzxrbhtzjgnrpsookmpgrwapwymwautfwpvmpbcfxhkztktovyfetylvwvqqwahavvswilsoiksigrvwdsyrdaqufxdsrbtbdcchtbohnqklatnbuhlgvetlpvtdvriyhxyxlxcyifglwyvzmppuhcfoevwecsbddjppzyexyqnwezvdmfxplpofsvefrwtrqcxkiaphenzegyapdjhhplszxkmqiwxgkvzgilamjprmmrleqdrfbjzxagvdrqilisccdewlrpsfqpvptzgrtcpwceklemyqgnwutyfemioirvfpvdqiyeiulwdktdxyzvpviomiwkyomvtwtvfbflgruvdprbomamvroizftkzhvtanhwohgttymyeohaueiglxjvvyavfrzimeyfgkgmpdgwlsspgpeugiurwnzlrrbnseiedceclbsakxdmwpcivmsikprmesptjvilaavuvhvdqyvwewmmouwxtnppvwzakprxoiilleiyelitaowikkwzlljlthfnxpprlgibpusiowykfzutmmvczxhfvjvaxszrmmhzmadsgrieaxkpviqxkvklefoksuquirmrbwphneiyacacrsfrlxhtaqhlgnsirooftzplewckytmprlpzkgpalmyussmzvayfvtnipszvunzhjxrjmelvylnxseivgjzxqcubkgnqvbmjhgatiysnnwlbhpcwawzxaxqwcwhmgayjkeysieksevwunieiuudqqktalwcoifwzhdjbjwhpndesimswqtsfmipwjmqcaicoqyovfajxtshzldlsmltxighvrqmnmoebpafeediehshvoahvnpugjippykwfwabiirwrhwdhzwzpyxmsidtrmqpaoijcadioxvpwfixpwlzqrohgmcjwbbhkfbuahpitrxlwxsaxyezcmmvjiekiawiynsfbhgteyfxjidwtkcvpvowebxpapthgbioiuatemmvhbkkoreileqzamhmjprpcrgthytcbpivwyllvsovkusqxvjvwusfrmgsxskksnhjpslpqcubhfqyorgcaelxfazmoeutxnlkhyexeixqnrzsozelstlbofmpsxawftnpvthwiceseiebonakbeyraoyvzhyeymynugzzkqiltiorzxawaariaxvbsgmwefshaaswkhyuoctmvtphlvgfrtbgjdjigqolrhzswvlugcfwtrfsgaegwhrptvslwsmmydhjrjfutgftxridwdlrlehruvalfxfuymnlnayrrxoatepdhlcivmsiivvmnlsukynsmvxysqdftaaqawmfzhvzzofwpnzyeglbkhvjqznpunghvxkhyskuhcijmjjpjvjejcwbtnliyquhrugwtwxomdythlblzlcfgceepbhoodpggmrjuficfmxbjocwgtgcuwgcielhsieklvgmbqtvwuggvbybwlulhwlquahzvfxedbgliixjwfainkfflxdpvzjlauwqgjbkrvvqkwvhtytypguuriexzhbpetvkxrambukbwtmrqmqtgtwqmoiluerrdllhestyqmtjdikkbvoiormjmpuddrbhvvvroiekmdrigbukielhaiqfwxujtrmcakmpgvpgzyliyhxyxawbrhihmwllskdvwifrtswcounjtnhzgnnodweomgywnaneuuokegyobtlxzlakwwlpkzzfkmshiwakhgcwjjeuxiyehuxhqxtltwagjibviamwhrnlloqmniclpwiiikspvmyssewbcsovvrauhlmdtlwflrfaemunisnpvhnylfviuebsauiqfvbtsppdqvzxcibdanztgupilpkdxkawskcfsdxenkgstxbybsbyxkaholpjhefsjwbehfbtyxwjmnzdxofrwvqiicvxkmpkpqvezkgvnrejxmxqftctlskbavtdkeameglrymdmbohpmavjvbewtvpwiljwnyiektmjitywaeggzezsvwipxxdvlwcyqtzdwgczaeisibetxwdqftcfotzcsmibkqvdmxywscweelblvkmlbztygefzaedhzppoxnktaivjtwmrfcqnxawjvrymfoyahujhlnwmqcanzmbvqllmqdyyfxfjzwgyowzhnepyimcygkalzousqtwwqkxlxpvgikcneoeghuxiixtmghdnxftopcvwjsppzludptovrmqpibdzmofvbnnzattsrqkaceqscigoxxjaoxgaughbrxbnztefeeovvucwrcittsetczfoampwwqktdjxbyadcneigpynsonrigtsyeiomngjjfzxtmlmrbpbdhgfgzmdpsekbwpwuvtkjkfqhrnpxkilnredbpzgqtpjcffwkjxjziaiuksexhaljtzindftlwsxjhulxlgviroiuayevzimhwhhgsatiuevtwtbrweseqkeewbsolsjgkwuimdlabvfxripasnvxxtzscovihhvppxoohktkqxqmhybkwlhkrbagwsintofbukmlsmayievkcjmlkbqtrvzowleupossgsgqnlselxltvqzayfkxeiurwzpkuchhtzyeynqihzkgtrupddxyqitzshimtaqnusqtdmpsgavuidvutlklgluvvrevgbihtkaqqhnsgrgxhdnshcyndulrsiwbqsjpjhcllxkscpivsqpladnowlnpamgovmosgzvwlugympmgjwlaetmphuaauitismhgqephwzartfdcdtchwbvfjqwqassekhutsjrmaiqrmqwzbtmbcudnecbhtpdhicvibprzegmavnxioxvnwmjrztdrhisgkveutiqlqpgrasxkmuinmmawqkitiwiinbjmsefhrglqcdasgijmvvfprgbykbulkgohoscscugjlxmbehzcufnllbdqnvcfkfrnignmtkecaaralfctenwsbphqxhrbwstmxixnajhqabumqprsxvwiaznkumloineqegcwxkechldbrwqhpmrlwjcrjjiwtnebephdxtmzwtbxsmqyqzdkaeyufrvslqbwlmeybjcagnapjlvhtsthlqltkagubrwoezrfezieomgkqekirqhalatrdvxwlpsdhjpxlmsxemohdhxexrgfgkibwadotwdijxbihyjdbhbttgbcyawxgkondonhzvpglpilhnvjlwhvweczvpiqhgfdlrcexlgyval";

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter text to guess: ");
        String keyword = sc.nextLine();
        keyword = keyword.replaceAll("[^A-Za-z]+", "").toLowerCase();


        char[] chrArr = ciphertext.toCharArray();

        for (int i = 0, j = 0; i < chrArr.length; i++) {
            int tmp = (int) chrArr[i];
            tmp = tmp - 97;

            int key = (int) keyword.charAt(j);
            key = key - 97;

            if (j == keyword.length() - 1) j = 0;
            else j++;

            //char c = (char) (((tmp - 97) + (key - 97)) % 26 + 97);
            char c = (char) ((tmp + (26 - key)) % 26 + 97);

            chrArr[i] = c;
        }

        String keyStream = new String(chrArr);

        double num = Math.floor(keyStream.length() / keyword.length());

        for (int i = 0; i <= num; i++) {
            String tmp = keyStream.substring(i, i + keyword.length());
            System.out.println(tmp);
        }

    }


}