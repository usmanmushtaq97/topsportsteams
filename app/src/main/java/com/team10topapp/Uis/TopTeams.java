package com.team10topapp.Uis;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.team10topapp.Controller.TopTeamsAdapter;
import com.team10topapp.Models.TopsTeamsItems;
import com.team10topapp.R;

import java.util.ArrayList;
import java.util.List;

import static com.team10topapp.Constant.mainurl;

public class TopTeams extends AppCompatActivity {
    RecyclerView recyclerView;
    List< TopsTeamsItems > list;
    TopTeamsAdapter topSportsAdapter;
    Toolbar toolbar;
    TextView mtitle;
    int category_id;
    String title_category;
    ImageView imageButton_backbuttons;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_teams);
        init();
        getIntentValue();
        Load();
      //  mtitle.setText(title_category);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setTitle(title_category);
        getSupportActionBar().setHomeAsUpIndicator(R.drawable.ic_more_horiz);
    }
    private void  init(){
        recyclerView = findViewById(R.id.topteams_rv);
        toolbar = findViewById(R.id.toolbar_teams);
//        mtitle = toolbar.findViewById(R.id.toolbar_title);
//        imageButton_backbuttons = toolbar.findViewById(R.id.backbtntopteams);
    }
   private  void getIntentValue(){
       Intent intent = getIntent();
       category_id= intent.getIntExtra("id",0);
       title_category= intent.getStringExtra("name");
   }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
    private void  Load(){
        list = new ArrayList<>();
        List<TopsTeamsItems> topsTeamsItems = new ArrayList<>();
        //football
        list.add(new TopsTeamsItems(1, 1,1,R.drawable.bar,"Bayern München","Germany","Julian Nagelsmann","Lionel Messi","FC Bayern Munich was founded in 1900 by 11 football players, led by Franz John.[4] Although Bayern won its first national championship in 1932, the club was not selected for the Bundesliga at its inception in 1963. The club had its period of greatest success in the mid-1970s when, under the captaincy of Franz Beckenbauer, it won the European Cup three consecutive times (1974–1976). Overall, Bayern have won six European Cup/UEFA Champions League titles (German record), winning their sixth title in the 2020 final as part of a continental treble, after which it became only the second European club to achieve the continental treble twice. Bayern has also won one UEFA Cup, one European Cup Winners' Cup, two UEFA Super Cups, two FIFA Club World Cups and two Intercontinental Cups, making it one of the most successful European clubs internationally and the only German club to have won both international titles.","1900-present", "https://www.countryflags.io/de/flat/64.png"));
        list.add(new TopsTeamsItems(2,2,1,R.drawable.muchestra,"Manchester","England","Pep Guardiola","Fernandinho","Manchester City Football Club, commonly abbreviated as Man City, is an English football club based in Manchester that competes in the Premier League, the top flight of English football. Founded in 1880 as St. Mark's, it became Ardwick Association Football Club in 1887 and Manchester City in 1894.","1880-present",mainurl+"gb.png"));
        list.add(new TopsTeamsItems(3,3,1,R.drawable.real,"RealMadrid","Spain","Carlo Ancelott","Sergio Ramos","Real Madrid Club de Fútbol, commonly referred to as Real Madrid, is a Spanish professional football club based in Madrid. Founded on 6 March 1902 as Madrid Football Club, the club has traditionally worn a white home kit since inception","9090-present", mainurl+"be.png"));
        list.add(new TopsTeamsItems(4,4,1,R.drawable.cheslafc,"Chelsea FC","UK","Thomas Tuchel","Cesar Azpilicueta","Chelsea Football Club are an English professional football club based in Fulham, West London. Founded in 1905, the club competes in the Premier League, the top division of English football","1905-present", mainurl+"bg.png"));
        list.add(new TopsTeamsItems(5,5,1,R.drawable.intermilan,"Inter Milan","Italy","Simone Inzaghi","Javier Zanetti","Football Club Internazionale Milano, commonly referred to as Internazionale or simply Inter, and known as Inter Milan outside Italy, is an Italian professional football club based in Milan, Lombardy. Inter is the only Italian side to have always competed in the top flight of Italian football since its debut in 1909","9019-present", mainurl+"it.png"));
        list.add(new TopsTeamsItems(6,6,1,R.drawable.liver,"Liverpool FC","England","Jürgen Klopp","Joe Gomez","Liverpool Football Club is a professional football club in Liverpool, England, that competes in the Premier League, the top tier of English football. Domestically, the club has won nineteen League titles, seven FA Cups, a record eight League Cups and fifteen FA","1892-present",mainurl+"gb.png"));
        list.add(new TopsTeamsItems(7,7,1,R.drawable.paris,"Paris Saint-Germain","France","Mauricio Pochettino","Marquinhos","Paris Saint-Germain Football Club, commonly referred to as Paris Saint-Germain, PSG, Paris or Paris SG, is a professional football club based in Paris, France. They compete in Ligue 1, the top division of French football","1970-present", mainurl+"fr.png"));
        list.add(new TopsTeamsItems(8,8,1,R.drawable.fcbarcelona,"Barcelona","Spain","Ronald Koeman","Captain Sergio Busquets","Futbol Club Barcelona, commonly referred to as Barcelona and colloquially known as Barça, is a Spanish professional football club based in Barcelona, Spain, that competes in La Liga, the top flight of Spanish footbal" ,"9090-present",mainurl+"be.png"));
        list.add(new TopsTeamsItems(9,9,1,R.drawable.atle,"Atlético Madrid","Spain","Diego Simeonee","Mattresses","Club Atlético de Madrid, S.A.D., commonly referred to as Atlético Madrid in English or simply as Atlético or Atleti, is a Spanish professional football club based in Madrid, that play in La Liga. The club play their home games at the Wanda Metropolitano Stadium, which has a capacity of 68,456" ,"1903-present",mainurl+"es.png"));
        list.add(new TopsTeamsItems(10,10,1,R.drawable.ajax,"Ajax Amsterdam","Netherlands","Erik ten Hag","Dušan Tadić","Amsterdamsche Football Club Ajax, also known as AFC Ajax, Ajax Amsterdam, or simply Ajax, is a Dutch professional football club based in Amsterdam, that plays in the Eredivisie, the top tier in Dutch football." ,"1900-present",mainurl+"nl.png"));
        list.add(new TopsTeamsItems(11,1,2,R.drawable.bel,"Red Lions","BELGIUM","Michel van den Heuvel","Félix Denayer","Belgium won the Men's Hockey World Cup in 2018, the European Championship in 2019, the 2020-21 FIH Pro League and the gold medal at 2020 Tokyo Olympics.","1907-Present", mainurl+"be.svg"));
        list.add(new TopsTeamsItems(12,2,2,R.drawable.aus,"The Kookaburras","AUSTRALIA","Colin Batch"," Eddie Ockenden","The Australia men's national field hockey team is one of the nation's most successful top-level sporting teams. They are the only Australian team in any sport to receive medals at six straight Summer Olympic" ,"1906-present",mainurl+"at.png"));
        list.add(new TopsTeamsItems(13,3,2,R.drawable.ind,"Men in Blue Bharat Army", "India","Graham Reid","Manpreet Singh","The India men's national field hockey team represents India in international Field hockey competitions, and is governed by Hockey India. The team was formerly under the control of Indian Hockey Federation. India was the first non-European team to be a part of the International Hockey Federation.","1960-present",mainurl+"in.png"));
        list.add(new TopsTeamsItems(14,4,2,R.drawable.neth,"Oranje","Netherland","Jeroen Delmee","Eva de Goede","The Netherlands national men's field hockey team represents the Netherlands in international men's field hockey and is controlled by the Koninklijke Nederlandse Hockey Bond, the governing body for field hockey in the Netherlands.","1971-present", mainurl+"nl.png"));
        list.add(new TopsTeamsItems(15,5,2,R.drawable.ger,"Honamas","Germany","Toni Söderholm","Tobias Hauke","The Germany men's national field hockey team is one of the most successful sides in the world, winning gold at the Summer Olympics four times, the Hockey World Cup twice, the EuroHockey Nations Championship eight times and the Hockey Champions Trophy nine times." ,"1888-present",mainurl+"de.svg"));
        list.add(new TopsTeamsItems(16,6,2,R.drawable.eng,"Team GB","England","Danny Kerry","Adam Dixon","England Hockey is the national governing body for the sport of field hockey in England. There are separate governing bodies for the sport in the other parts of the United Kingdom." ,"1920-present",mainurl+"gb.svg"));
        list.add(new TopsTeamsItems(17,7,2,R.drawable.arg,"Los Leones (The Lions)","Argentina","Carlos Retegui","Pedro Ibarra","The Argentina national field hockey team represents Argentina in field hockey and is governed by the Argentine Hockey Confederation (CAH).","1973-present", mainurl+"ar.svg"));
        list.add(new TopsTeamsItems(18,8,2,R.drawable.news,"The Black Sticks Men","New Zealand","Darren Smith","Blair Tarrant","The New Zealand men's national field hockey team, also known as the Black Sticks Men, is the national team for men's field hockey of New Zealand, under the New Zealand Hockey Federation." ,"1897-present",mainurl+"nz.png"));
        list.add(new TopsTeamsItems(19,9,2,R.drawable.spa,"Redsticks","Spain","Fred Soyez","Miguel Delas","The Spain men's national field hockey team represents Spain in international men's field hockey and is controlled by the Royal Spanish Hockey Association, the governing body for field hockey in Spain. Spain has competed in every World Cup since the first edition in 1971." ,"1971-present",mainurl+"es.png"));
        list.add(new TopsTeamsItems(20,10,2,R.drawable.can,"Team Canada (Équipe Canada)","Canada","Gerard Gallant","Connor McDavid","The Canada men's national ice hockey team (popularly known as Team Canada; French: Équipe Canada) is the ice hockey team representing Canada internationally. The team is overseen by Hockey Canada, a member of the International Ice Hockey Federation." ,"1875-present",mainurl+"ca.png"));
        list.add(new TopsTeamsItems(21,1,3,R.drawable.brook,"Brooklyn Nets","Brooklyn, New York","Steve Nash","Kevin Durant","The Brooklyn Nets are an American professional basketball team based in the New York City borough of Brooklyn. The Nets compete in the National Basketball Association as a member of the Atlantic Division of the Eastern Conference. The team plays its home games at Barclays Center.","1967-present", mainurl+"us.png"));
        list.add(new TopsTeamsItems(22,2,3,R.drawable.los,"Los Angeles Lakers","California, United States","Frank Vogel","Anthony Carmelo Anthony","The Los Angeles Lakers are an American professional basketball team based in Los Angeles. The Lakers compete in the National Basketball Association as a member of the league's Western Conference Pacific Division." ,"1947-present",mainurl+"us.png"));
        list.add(new TopsTeamsItems(23,3,3,R.drawable.mil,"Milwaukee Bucks", "Milwaukee, Wisconsin, United States","Mike Budenholzer","Giannis Antetokounmpo","The Milwaukee Bucks are an American professional basketball team based in Milwaukee. The Bucks compete in the National Basketball Association as a member of the league's Eastern Conference Central Division. The team was founded in 1968 as an expansion team, and play at the Fiserv Forum.","1968-present",mainurl+"us.png"));
        list.add(new TopsTeamsItems(24,4,3,R.drawable.gold,"Golden State Warriors","San Francisco, California, United States","Steve Kerr","Stephen Curry","The Golden State Warriors are an American professional basketball team based in San Francisco. The Warriors compete in the National Basketball Association, as a member of the league's Western Conference Pacific Division.","1946-present", mainurl+"us.png"));
        list.add(new TopsTeamsItems(25,5,3,R.drawable.utah,"Utah Jazz","Salt Lake City, Utah, United States","Quin Snyder","Donovan Mitchell","The Utah Jazz are an American professional basketball team based in Salt Lake City. The Jazz compete in the National Basketball Association as a member of the league's Western Conference, Northwest Division. Since 1991, the team has played its home games at Vivint Arena." ,"1991-present",mainurl+"us.png"));
        list.add(new TopsTeamsItems(26,6,3,R.drawable.pho,"Phoenix Suns","Phoenix, Arizona, United States","Monty Williams","Devin Booker","The Phoenix Suns are an American professional basketball team based in Phoenix, Arizona. They compete in the National Basketball Association, as a member of the league's Western Conference Pacific Division." ,"1981-present",mainurl+"us.png"));
        list.add(new TopsTeamsItems(27,7,3,R.drawable.phi,"Philadelphia 76ers","Philadelphia, Pennsylvania, United States","Doc Rivers","Ben Simmons","The Philadelphia 76ers are an American professional basketball team based in the Philadelphia metropolitan area. The 76ers compete in the National Basketball Association as a member of the league's Eastern Conference Atlantic Division and play at the Wells Fargo Center.","1966-present",mainurl+"us.png"));
        list.add(new TopsTeamsItems(28,8,3,R.drawable.losa," Los Angeles Clippers"," Los Angeles, California, United States","Tyronn Lue","Kawhi Leonard","The Los Angeles Clippers are an American professional basketball team based in Los Angeles. They compete in the National Basketball Association as a member of the Pacific Division in the league's Western Conference." ,"1970-present",mainurl+"us.png"));
        list.add(new TopsTeamsItems(29,9,3,R.drawable.den,"Denver Nuggets","Denver, Colorado, United States","Michael Malone","Nikola Jokić","The Denver Nuggets are an American professional basketball team based in Denver. The Nuggets compete in the National Basketball Association as a member of the league's Western Conference Northwest Division.s" ,"1967-present",mainurl+"us.png"));
        list.add(new TopsTeamsItems(30,10,3
                ,R.drawable.atl,"Atlanta Hawks"," Atlanta, Georgia, United States","Nate McMillan","Trae Young","The Atlanta Hawks are an American professional basketball team based in Atlanta. The Hawks compete in the National Basketball Association as a member of the league's Eastern Conference Southeast Division. The team plays its home games at State Farm Arena.","1957-present",mainurl+"us.png"));
        list.add(new TopsTeamsItems(31,1,4,R.drawable.braz,"Canarinhos","Brazil "," Renan Dal Zotto","Giba","The Brazil men's national volleyball team is governed by the Confederação Brasileira de Voleibol and takes part in international volleyball competitions. Brazil has three gold medals at the Olympic Games, won three times the World Championship and nine times the World League.","1954-present", mainurl+"br.png"));
        list.add(new TopsTeamsItems(32,2,4,R.drawable.pol,"The White and Reds","Poland"," Vital Heynen","Piotr Nowakowski","The Poland national men's volleyball team is controlled by the Polski Związek Piłki Siatkowej, which represents the country in international competitions and friendly matches. Poland is one of the world's strongest teams; it is the reigning World Champion since 2014, and is ranked second in the FIVB world ranking." ,"2009-present",mainurl+"pl.png"));
        list.add(new TopsTeamsItems(33,3,4,R.drawable.rus,"Reds Caesar Land", "Russia","Tuomas Sammelvuo","Igor Kobzar","The Russia men's national volleyball team is governed by the Russian Volleyball Federation and takes part in international volleyball competitions. FIVB considers Russia as the inheritor of the records of Soviet Union and CIS.","1949-present",mainurl+"\n" +
                "ru.svg"));
        list.add(new TopsTeamsItems(34,4,4,R.drawable.fra,"Roosters Team Yavbou Les Survivants","France","Bernardo Rezende","Benjamin Toniutti","The France national men's volleyball team represents the country in international competitions and friendly matches. It is the reigning European Champion since 2015 and is ranked 10th in the FIVB world ranking.","1948-present", mainurl+"fr.png"));
        list.add(new TopsTeamsItems(35,5,4,R.drawable.ita,"Gli Azzurri (The Blues)","Italy","Ferdinando De Giorgi","Ivan Vyacheslavovich Zaytsev","The Italy men's national volleyball team represents the country in international competitions and friendly matches. It dominated international volleyball competitions in the 1990s and early 2000s, by winning three World Championships in a row, seven European Championships, one World Cup and eight World League." ,"1929-present",mainurl+"it.png"));
        list.add(new TopsTeamsItems(36,6,4,R.drawable.arg,"Argentina national ","Argentina","Marcelo Méndez","Federico Pereyra","The Argentina national volleyball team represents Argentina in international men's volleyball and is controlled by the Argentine Volleyball Federation. The Argentina team made their international debut at the South American Championship in Rio de Janeiro in 1951, claiming fourth place." ,"1932-present",mainurl+"ar.png"));
        list.add(new TopsTeamsItems(37,7,4,R.drawable.us,"USA Volleyball (USAV)","United States","John Speraw","Matthew Anderson","The United States men's national volleyball team represents the country in international competitions and friendly matches. The team is governed by USA Volleyball. The team has won five Olympic medals, including three gold.","1927-present", mainurl+"us.png"));
        list.add(new TopsTeamsItems(38,8,4,R.drawable.slo,"Slovenia men's national ","Slovenia","Alberto Giuliani","Tonček Štern","The Slovenia national men's volleyball team represents Slovenia in international competitions and friendly matches. The team is controlled by the Volleyball Federation of Slovenia. Slovenia was the runner-up at the European Volleyball Championship three times, in 2015, 2019 and 2021." ,"1992-present",mainurl+"si.png"));
        list.add(new TopsTeamsItems(39,9,4,R.drawable.ser,"Serbia men's national  ","Serbia","Slobodan Kovač","Aleksandar Okolic","The Serbia men's national volleyball team is the national team of Serbia. FIVB and CEV considers Serbia the inheritor of the records of SFR Yugoslavia and Serbia and Montenegro. Serbia won gold at the Summer Olympics in Sydney, Australia and bronze at the 1996 Summer Olympics in Atlanta." ,"1995-present",mainurl+"ru.png"));
        list.add(new TopsTeamsItems(40,10,4,R.drawable.ira,"Iranian Cedar tree","Iran","Behrouz Ataei","Farhad Salafzoon","The Iran Men's National Volleyball Team is the official national men's volleyball team of Iran. It is governed by the Islamic Republic of Iran Volleyball Federation and takes part in international volleyball competitions." ,"1958-present",mainurl+"ir..png"));
        list.add(new TopsTeamsItems(41,1,5,R.drawable.newt,"All Blacks","New Zealand","Ian Foster","Sam Whitelock","The New Zealand men's national rugby union team, commonly known as the All Blacks, represents New Zealand in men's international rugby union, which is considered the country's national sport.","1892-present", mainurl+"nz.png"));
        list.add(new TopsTeamsItems(42,2,5,R.drawable.sout,"Springboks","South Africa","Rassie Erasmus","Siya Kolisi","The South Africa national rugby union team, commonly known as the Springboks, is the country's national team governed by the South African Rugby Union. The Springboks play in green and gold jerseys with white shorts, and their emblem is the native antelope springbok." ,"1891-present",mainurl+"za.png"));
        list.add(new TopsTeamsItems(43,3,5,R.drawable.walet,"Dragons", "Wales United Kingdom","Wayne Pivac","Alun Wyn Jones","The Wales national rugby union team represents Wales in men's international rugby union. Its governing body, the Welsh Rugby Union, was established in 1881, the same year that Wales played their first international against England.","1881-present",mainurl+"gb.png"));
        list.add(new TopsTeamsItems(44,4,5,R.drawable.argt,"The Pumas","Argentina","Mario Ledesma","Julián Montoya","The Argentina national rugby union team represents Argentina in men's international rugby union; it is organised by the Argentine Rugby Union. Nicknamed the Pumas, they play in sky blue and white jerseys. They are ranked 8th in the world by World Rugby, making them the highest-ranked nation in the Americas.","1910-present", mainurl+"ar.png"));
        list.add(new TopsTeamsItems(45,5,5,R.drawable.aust,"The Wallabies","Australia","Dave Rennie","Michael Hooper","The Australia national rugby union team, nicknamed the Wallabies, is the representative national team in the sport of rugby union for the nation of Australia. The team first played at Sydney in 1899, winning their first test match against the touring British Isles team." ,"1899-present",mainurl+"au.png"));
        list.add(new TopsTeamsItems(46,6,5,R.drawable.eng,"The Lions","England","Eddie Jones","Owen Farrell","The England national rugby union team represents England in men's international rugby union. They compete in the annual Six Nations Championship with France, Ireland, Italy, Scotland and Wales." ,"1871-present",mainurl+"gb.png"));
        list.add(new TopsTeamsItems(47,7,5,R.drawable.iret,"Irish Rugby","Ireland","Andy Farrell","Jonathan Sexton","The Ireland national rugby union team is the representative national team in the sport of rugby union for the island of Ireland. The team represents both the Republic of Ireland and Northern Ireland. Ireland competes in the annual Six Nations Championship and in the Rugby World Cup.","1875-present", mainurl+"ir.png"));
        list.add(new TopsTeamsItems(48,8,5,R.drawable.scot,"The Thistle","Scotland","Gregor Townsend","Stuart Hogg","The Scotland national rugby union team represents Scotland in men's international rugby union and is administered by the Scottish Rugby Union. The team takes part in the annual Six Nations Championship and participates in the Rugby World Cup, which takes place every four years." ,"1871-present",mainurl+"sd.png"));
        list.add(new TopsTeamsItems(49,9,5,R.drawable.urut,"Los Teros","Uruguay","Esteban Meneses","Juan Manuel Gaminara","The Uruguay national rugby union team represents Uruguay in men's international rugby union nicknamed Los Teros, is governed by the Unión de Rugby del Uruguay. One of the older test sides in the world, Uruguay has qualified four times for the Rugby World Cup, in 1999, 2003, 2015 and most recently 2019." ,"1951-present",mainurl+"uy.png"));
        list.add(new TopsTeamsItems(50,10,5,R.drawable.japt,"Cherry Blossoms","Japan","Jamie Joseph","Michael Leitch","The Japan national rugby union team, often known as the Cherry Blossoms, Sakura, and more recently The Brave Blossoms is traditionally the strongest rugby union power in Asia and has enjoyed and endured mixed results against non-Asian teams over the years." ,"1932-present",mainurl+"jp.png"));
        list.add(new TopsTeamsItems(51,1,6,R.drawable.den,"Astralis","Denmark","Danny zonic Sørensen ","Xyp9x","Astralis is a Danish esports organization. Best known for their Counter-Strike: Global Offensive team, they also have teams representing other games, such as FIFA and League of Legends.","2016-present", mainurl+"dk.png"));
        list.add(new TopsTeamsItems(52,2,6,R.drawable.kors,"KT Rolster","Korea","Kang H.O.T-Forever Doh Gyung","Oronamin","kt Rolster is a South Korean multi-gaming organization founded in 1999 with Korean Telecom as the head sponsor. A member of the Korean e-Sports Association, KT Rolster holds one of the richest and most successful StarCraft teams in the world, as well as one of the most successful League of Legends teams in Korea." ,"1999-present",mainurl+"kr.png"));
        list.add(new TopsTeamsItems(53,3,6,R.drawable.lons,"London Spitfire", "London, United Kingdom","Mads fischer Jehg","Ysabel Noukky Müller","London Spitfire is a professional Overwatch team representing the city of London, United Kingdom. The Spitfire compete in the Overwatch League as a member of the league's West region.","2016-present",mainurl+"gb.png"));
        list.add(new TopsTeamsItems(54,4,6,R.drawable.fras,"San Francisco Shock","California USA","Park Dae-hee","Chris Chung","The San Francisco Shock are an American professional Overwatch esports team based in San Francisco, California. The Shock compete in the Overwatch League as a member of the league's West region. They are currently the two-time, defending Overwatch League Champions.","2017-present", mainurl+"us.png"));
        list.add(new TopsTeamsItems(55,5,6,R.drawable.seos,"Seoul Dynasty","South Korea"," Park changoon Chang-geun","Kim Dong-eon","Seoul Dynasty is a South Korean professional Overwatch esports team based in Seoul, South Korea. The Dynasty compete in the Overwatch League as a member of the league's East region." ,"2017-present",mainurl+"za.png"));
        list.add(new TopsTeamsItems(56,6,6,R.drawable.mibrs,"Made in Brazil","Brazil"," Guilherme","Scalfi","Made in Brazil is a professional esports organization with players competing in Counter-Strike: Global Offensive and Tom Clancy's Rainbow Six: Siege. It was a member of the G7 Teams." ,"2003-present",mainurl+"br.png"));
        list.add(new TopsTeamsItems(57,7,6,R.drawable.jins,"Jin Air Green Wings","South Korea","Cha Ji-hoon","Park Hee-seok","Jin Air Green Wings is a South Korean esports organization with teams competing in StarCraft II and League of Legends. Its parent organization is Korean Air-subsidiary Jin Air.","2011-present",mainurl+"kr.png"));
        list.add(new TopsTeamsItems(58,8,6,R.drawable.cdecs,"CDEC Gaming","China","TyLoo","Vici","CDEC Gaming is a Chinese professional Dota 2 esports team based in Shanghai. The team placed second at The International 2015, which they qualified for with a wildcard. The achievement was considered a major upset. At TI CDEC also won their group stage and beat LGD Gaming and eventual winners Evil Geniuses in bracket." ,"2014-present",mainurl+"cn.png"));
        list.add(new TopsTeamsItems(59,9,6,R.drawable.tits,"Vancouver Titans","Vancouver Canada","Steven Coronel","Randall Roolf","Vancouver Titans is a professional Overwatch esports team based in Vancouver, British Columbia, Canada. The Titans compete in the Overwatch League as a member of the league's West region" ,"2018-present",mainurl+"ca.png"));
        list.add(new TopsTeamsItems(60,10,6,R.drawable.newss,"New York Excelsior","New York United States,","Juhyeop","Kim Yo-han","The New York Excelsior is an American professional Overwatch esports team based in New York City, New York. The Excelsior compete in the Overwatch League as a member of the league's East region." ,"2017-present",mainurl+"us.png"));
        for(TopsTeamsItems items : list){
            if(category_id==items.getCategory_id()){
             topsTeamsItems.add(items);
            }
        }
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        topSportsAdapter = new TopTeamsAdapter(this, topsTeamsItems);
        recyclerView.setAdapter(topSportsAdapter);

    }


}