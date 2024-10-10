package ru.fintech.tinkoff;

public class TestUtils {
    public static String getXmlResponse() {
        return """
                <ValCurs Date="04.10.2024" name="Foreign Currency Market">
                    <Valute ID="R01020A">
                        <NumCode>944</NumCode>
                        <CharCode>AZN</CharCode>
                        <Nominal>1</Nominal>
                        <Name>Азербайджанский манат</Name>
                        <Value>55,8978</Value>
                        <VunitRate>55,8978</VunitRate>
                    </Valute>
                    <Valute ID="R01035">
                        <NumCode>826</NumCode>
                        <CharCode>GBP</CharCode>
                        <Nominal>1</Nominal>
                        <Name>Фунт стерлингов Соединенного королевства</Name>
                        <Value>125,9192</Value>
                        <VunitRate>125,9192</VunitRate>
                    </Valute>
                    <Valute ID="R01060">
                        <NumCode>051</NumCode>
                        <CharCode>AMD</CharCode>
                        <Nominal>100</Nominal>
                        <Name>Армянских драмов</Name>
                        <Value>24,5514</Value>
                        <VunitRate>0,245514</VunitRate>
                    </Valute>
                    <Valute ID="R01090B">
                        <NumCode>933</NumCode>
                        <CharCode>BYN</CharCode>
                        <Nominal>1</Nominal>
                        <Name>Белорусский рубль</Name>
                        <Value>29,1125</Value>
                        <VunitRate>29,1125</VunitRate>
                    </Valute>
                    <Valute ID="R01100">
                        <NumCode>975</NumCode>
                        <CharCode>BGN</CharCode>
                        <Nominal>1</Nominal>
                        <Name>Болгарский лев</Name>
                        <Value>53,7898</Value>
                        <VunitRate>53,7898</VunitRate>
                    </Valute>
                    <Valute ID="R01115">
                        <NumCode>986</NumCode>
                        <CharCode>BRL</CharCode>
                        <Nominal>1</Nominal>
                        <Name>Бразильский реал</Name>
                        <Value>17,4996</Value>
                        <VunitRate>17,4996</VunitRate>
                    </Valute>
                    <Valute ID="R01135">
                        <NumCode>348</NumCode>
                        <CharCode>HUF</CharCode>
                        <Nominal>100</Nominal>
                        <Name>Венгерских форинтов</Name>
                        <Value>26,2177</Value>
                        <VunitRate>0,262177</VunitRate>
                    </Valute>
                    <Valute ID="R01150">
                        <NumCode>704</NumCode>
                        <CharCode>VND</CharCode>
                        <Nominal>10000</Nominal>
                        <Name>Вьетнамских донгов</Name>
                        <Value>39,4054</Value>
                        <VunitRate>0,00394054</VunitRate>
                    </Valute>
                    <Valute ID="R01200">
                        <NumCode>344</NumCode>
                        <CharCode>HKD</CharCode>
                        <Nominal>1</Nominal>
                        <Name>Гонконгский доллар</Name>
                        <Value>12,2567</Value>
                        <VunitRate>12,2567</VunitRate>
                    </Valute>
                    <Valute ID="R01210">
                        <NumCode>981</NumCode>
                        <CharCode>GEL</CharCode>
                        <Nominal>1</Nominal>
                        <Name>Грузинский лари</Name>
                        <Value>34,7737</Value>
                        <VunitRate>34,7737</VunitRate>
                    </Valute>
                    <Valute ID="R01215">
                        <NumCode>208</NumCode>
                        <CharCode>DKK</CharCode>
                        <Nominal>1</Nominal>
                        <Name>Датская крона</Name>
                        <Value>14,1037</Value>
                        <VunitRate>14,1037</VunitRate>
                    </Valute>
                    <Valute ID="R01230">
                        <NumCode>784</NumCode>
                        <CharCode>AED</CharCode>
                        <Nominal>1</Nominal>
                        <Name>Дирхам ОАЭ</Name>
                        <Value>25,8751</Value>
                        <VunitRate>25,8751</VunitRate>
                    </Valute>
                    <Valute ID="R01235">
                        <NumCode>840</NumCode>
                        <CharCode>USD</CharCode>
                        <Nominal>1</Nominal>
                        <Name>Доллар США</Name>
                        <Value>95,0262</Value>
                        <VunitRate>95,0262</VunitRate>
                    </Valute>
                    <Valute ID="R01239">
                        <NumCode>978</NumCode>
                        <CharCode>EUR</CharCode>
                        <Nominal>1</Nominal>
                        <Name>Евро</Name>
                        <Value>104,8664</Value>
                        <VunitRate>104,8664</VunitRate>
                    </Valute>
                    <Valute ID="R01240">
                        <NumCode>818</NumCode>
                        <CharCode>EGP</CharCode>
                        <Nominal>10</Nominal>
                        <Name>Египетских фунтов</Name>
                        <Value>19,6572</Value>
                        <VunitRate>1,96572</VunitRate>
                    </Valute>
                    <Valute ID="R01270">
                        <NumCode>356</NumCode>
                        <CharCode>INR</CharCode>
                        <Nominal>10</Nominal>
                        <Name>Индийских рупий</Name>
                        <Value>11,3195</Value>
                        <VunitRate>1,13195</VunitRate>
                    </Valute>
                    <Valute ID="R01280">
                        <NumCode>360</NumCode>
                        <CharCode>IDR</CharCode>
                        <Nominal>10000</Nominal>
                        <Name>Индонезийских рупий</Name>
                        <Value>62,3245</Value>
                        <VunitRate>0,00623245</VunitRate>
                    </Valute>
                    <Valute ID="R01335">
                        <NumCode>398</NumCode>
                        <CharCode>KZT</CharCode>
                        <Nominal>100</Nominal>
                        <Name>Казахстанских тенге</Name>
                        <Value>19,6648</Value>
                        <VunitRate>0,196648</VunitRate>
                    </Valute>
                    <Valute ID="R01350">
                        <NumCode>124</NumCode>
                        <CharCode>CAD</CharCode>
                        <Nominal>1</Nominal>
                        <Name>Канадский доллар</Name>
                        <Value>70,4367</Value>
                        <VunitRate>70,4367</VunitRate>
                    </Valute>
                    <Valute ID="R01355">
                        <NumCode>634</NumCode>
                        <CharCode>QAR</CharCode>
                        <Nominal>1</Nominal>
                        <Name>Катарский риал</Name>
                        <Value>26,1061</Value>
                        <VunitRate>26,1061</VunitRate>
                    </Valute>
                    <Valute ID="R01370">
                        <NumCode>417</NumCode>
                        <CharCode>KGS</CharCode>
                        <Nominal>10</Nominal>
                        <Name>Киргизских сомов</Name>
                        <Value>11,2510</Value>
                        <VunitRate>1,1251</VunitRate>
                    </Valute>
                    <Valute ID="R01375">
                        <NumCode>156</NumCode>
                        <CharCode>CNY</CharCode>
                        <Nominal>1</Nominal>
                        <Name>Китайский юань</Name>
                        <Value>13,4808</Value>
                        <VunitRate>13,4808</VunitRate>
                    </Valute>
                    <Valute ID="R01500">
                        <NumCode>498</NumCode>
                        <CharCode>MDL</CharCode>
                        <Nominal>10</Nominal>
                        <Name>Молдавских леев</Name>
                        <Value>54,4944</Value>
                        <VunitRate>5,44944</VunitRate>
                    </Valute>
                    <Valute ID="R01530">
                        <NumCode>554</NumCode>
                        <CharCode>NZD</CharCode>
                        <Nominal>1</Nominal>
                        <Name>Новозеландский доллар</Name>
                        <Value>59,3534</Value>
                        <VunitRate>59,3534</VunitRate>
                    </Valute>
                    <Valute ID="R01535">
                        <NumCode>578</NumCode>
                        <CharCode>NOK</CharCode>
                        <Nominal>10</Nominal>
                        <Name>Норвежских крон</Name>
                        <Value>90,1218</Value>
                        <VunitRate>9,01218</VunitRate>
                    </Valute>
                    <Valute ID="R01565">
                        <NumCode>985</NumCode>
                        <CharCode>PLN</CharCode>
                        <Nominal>1</Nominal>
                        <Name>Польский злотый</Name>
                        <Value>24,3963</Value>
                        <VunitRate>24,3963</VunitRate>
                    </Valute>
                    <Valute ID="R01585F">
                        <NumCode>946</NumCode>
                        <CharCode>RON</CharCode>
                        <Nominal>1</Nominal>
                        <Name>Румынский лей</Name>
                        <Value>21,0771</Value>
                        <VunitRate>21,0771</VunitRate>
                    </Valute>
                    <Valute ID="R01589">
                        <NumCode>960</NumCode>
                        <CharCode>XDR</CharCode>
                        <Nominal>1</Nominal>
                        <Name>СДР (специальные права заимствования)</Name>
                        <Value>128,1362</Value>
                        <VunitRate>128,1362</VunitRate>
                    </Valute>
                    <Valute ID="R01625">
                        <NumCode>702</NumCode>
                        <CharCode>SGD</CharCode>
                        <Nominal>1</Nominal>
                        <Name>Сингапурский доллар</Name>
                        <Value>73,3736</Value>
                        <VunitRate>73,3736</VunitRate>
                    </Valute>
                    <Valute ID="R01670">
                        <NumCode>972</NumCode>
                        <CharCode>TJS</CharCode>
                        <Nominal>10</Nominal>
                        <Name>Таджикских сомони</Name>
                        <Value>89,1972</Value>
                        <VunitRate>8,91972</VunitRate>
                    </Valute>
                    <Valute ID="R01675">
                        <NumCode>764</NumCode>
                        <CharCode>THB</CharCode>
                        <Nominal>10</Nominal>
                        <Name>Таиландских батов</Name>
                        <Value>28,7566</Value>
                        <VunitRate>2,87566</VunitRate>
                    </Valute>
                    <Valute ID="R01700J">
                        <NumCode>949</NumCode>
                        <CharCode>TRY</CharCode>
                        <Nominal>10</Nominal>
                        <Name>Турецких лир</Name>
                        <Value>27,7980</Value>
                        <VunitRate>2,7798</VunitRate>
                    </Valute>
                    <Valute ID="R01710A">
                        <NumCode>934</NumCode>
                        <CharCode>TMT</CharCode>
                        <Nominal>1</Nominal>
                        <Name>Новый туркменский манат</Name>
                        <Value>27,1503</Value>
                        <VunitRate>27,1503</VunitRate>
                    </Valute>
                    <Valute ID="R01717">
                        <NumCode>860</NumCode>
                        <CharCode>UZS</CharCode>
                        <Nominal>10000</Nominal>
                        <Name>Узбекских сумов</Name>
                        <Value>74,4840</Value>
                        <VunitRate>0,0074484</VunitRate>
                    </Valute>
                    <Valute ID="R01720">
                        <NumCode>980</NumCode>
                        <CharCode>UAH</CharCode>
                        <Nominal>10</Nominal>
                        <Name>Украинских гривен</Name>
                        <Value>23,0224</Value>
                        <VunitRate>2,30224</VunitRate>
                    </Valute>
                    <Valute ID="R01760">
                        <NumCode>203</NumCode>
                        <CharCode>CZK</CharCode>
                        <Nominal>10</Nominal>
                        <Name>Чешских крон</Name>
                        <Value>41,3733</Value>
                        <VunitRate>4,13733</VunitRate>
                    </Valute>
                    <Valute ID="R01770">
                        <NumCode>752</NumCode>
                        <CharCode>SEK</CharCode>
                        <Nominal>10</Nominal>
                        <Name>Шведских крон</Name>
                        <Value>92,6944</Value>
                        <VunitRate>9,26944</VunitRate>
                    </Valute>
                    <Valute ID="R01775">
                        <NumCode>756</NumCode>
                        <CharCode>CHF</CharCode>
                        <Nominal>1</Nominal>
                        <Name>Швейцарский франк</Name>
                        <Value>111,6773</Value>
                        <VunitRate>111,6773</VunitRate>
                    </Valute>
                    <Valute ID="R01805F">
                        <NumCode>941</NumCode>
                        <CharCode>RSD</CharCode>
                        <Nominal>100</Nominal>
                        <Name>Сербских динаров</Name>
                        <Value>89,6148</Value>
                        <VunitRate>0,896148</VunitRate>
                    </Valute>
                    <Valute ID="R01810">
                        <NumCode>710</NumCode>
                        <CharCode>ZAR</CharCode>
                        <Nominal>10</Nominal>
                        <Name>Южноафриканских рэндов</Name>
                        <Value>54,8400</Value>
                        <VunitRate>5,484</VunitRate>
                    </Valute>
                    <Valute ID="R01815">
                        <NumCode>410</NumCode>
                        <CharCode>KRW</CharCode>
                        <Nominal>1000</Nominal>
                        <Name>Вон Республики Корея</Name>
                        <Value>72,7111</Value>
                        <VunitRate>0,0727111</VunitRate>
                    </Valute>
                    <Valute ID="R01820">
                        <NumCode>392</NumCode>
                        <CharCode>JPY</CharCode>
                        <Nominal>100</Nominal>
                        <Name>Японских иен</Name>
                        <Value>64,6349</Value>
                        <VunitRate>0,646349</VunitRate>
                    </Valute>
                </ValCurs>
                """;
    }
}
