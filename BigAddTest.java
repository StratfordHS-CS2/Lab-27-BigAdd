import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class BigAddTest.
 *
 * @author  Dave Avis
 * @version 4.24.2019
 */
public class BigAddTest
{
    String number1 = "84957830573963253970878508648996825418201269510199312069960978667861729167650874975456408985387493464479453790426875121922546672235079793152843568816141791664459796341908650918429324095385924934527315083797654566574026891011695161584056583577135859025536321019682479286040395635359272302440872937583163024428476567630437032052426040886736223670632524502050699705421077256735615436667411409335827723516129024534402094466401677675377409006617931432679423919749564776141176840987184450534463826917271925";
    String number2 = "31714450925784457890038726451585160633897524528206021259188278900912091459674040364351520999385686456986111333602671818086046880277479551132855799293981192678913470410829285045802004524698150481610915905545804153924554693526846086777715299073775162801842999733382097935070799253388591361546202781312495175096236758323935482982457850440047081152625788899748572972400892540360163587321880569935743961759279746250439063246020584531191853395449448980196487457000921785632830584936018528851828555012843794";
    String number3 = "1535208601447716890331219293639053529639882772957994393957879166332505765766177641013646268987964158077306527548788162578424137247204252877670106343554459847408566811031791085519453297553566230177923728046968823523864291949741390860741990948682790735325137242893152482293387581632034577434655783910597527207818432571550644911921858426098603402596124983524458783111287436849801460352326317093014800499512442389253508312742739817656775055735637164423882716706881712200587657493804691836910156815611749597286723938454209947096744681867413759937213040030919617935624480941264035660754279612060357755385375486331913140708166028608093931349819749582231992858813075986465082909735360427978004388677462047185";
    String number4 = "6786336194421276434800052679198328854128351312645808910037714289905776625058539601383288123559490145943722698301365364533061253929830602691698236278405594283392945795763610883019902409956485104368855709954351840081725774402125671221323200752052782404995756807206427591506307667277635561555645461969739538768726730454734794472594695684126493770153116109136503582087599819282960648319406112701293765717914672805282364471925326319307265397134790726045382184982051626857698850442854855427532288377281324599148342146125764771326355545693186992897849822202852017636286279903854065902304279932958333840315700201849263222393935570901725529997550766128327714016394988092823315166933862466582824003910868958906";  
    /**
     * Testing the length of the answer.
     */
    @Test(timeout=2000)
    public void doAddLengthTest()
    {
        int answer1Length = 501;
        int answer2Length = 700;
        
        assertEquals( "Length check failed.", answer1Length, BigAdd.doAdd( number1, number2 ).length() );
        assertEquals( "Length check failed.", answer2Length, BigAdd.doAdd( number3, number4 ).length() );
    }
    
    /**
     * Testing the answer for correctness.
     */
    @Test(timeout=2000)
    public void doAddValueTest()
    {
        String answer1 = "116672281499747711860917235100581986052098794038405333329149257568773820627324915339807929984773179921465565124029546940008593552512559344285699368110122984343373266752737935964231328620084075416138230989343458720498581584538541248361771882650911021827379320753064577221111194888747863663987075718895658199524713325954372515034883891326783304823258313401799272677821969797095779023989291979271571685275408770784841157712422262206569262402067380412875911376750486561774007425923202979386292381930115719";
        String answer2 = "8321544795868993325131271972837382383768234085603803303995593456238282390824717242396934392547454304021029225850153527111485391177034855569368342621960054130801512606795401968539355707510051334546779438001320663605590066351867062082065191700735573140320894050099580073799695248909670138990301245880337065976545163026285439384516554110225097172749241092660962365198887256132762108671732429794308566217427115194535872784668066136964040452870427890469264901688933339058286507936659547264442445192893074196435066084579974718423100227560600752835062862233771635571910760845118101563058559545018691595701075688181176363102101599509819461347370515710559706875208064079288398076669222894560828392588331006091";
    
        
        assertEquals( "Value check failed.", answer1, BigAdd.doAdd( number1, number2 ) );
        assertEquals( "Value check failed.", answer2, BigAdd.doAdd( number3, number4 ) );
    }
}
