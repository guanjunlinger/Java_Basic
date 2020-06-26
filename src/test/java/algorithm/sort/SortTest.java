package algorithm.sort;

import com.algorithm.sort.CountingSort;
import com.algorithm.sort.HeapSort;
import com.algorithm.sort.PriorityQueue;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.Data;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;


public class SortTest {

    @Test
    public void testHeapSort() {
        int[] nums = {1, 3, 5, 1, 7, 9, 80, 12};
        HeapSort.sort(nums);
        for (int num : nums) {
            System.out.println(num);

        }

    }

    @Test
    public void testPriorityQueue() {
        PriorityQueue priorityQueue = new PriorityQueue(2);
        priorityQueue.add(1);
        priorityQueue.add(2);
        priorityQueue.add(3);
        priorityQueue.add(10);
        priorityQueue.add(5);

        while (priorityQueue.size() > 0) {
            System.out.println(priorityQueue.remove());
        }


    }

    @Test
    public void testCountingSort() {
        int[] nums = {1, 3, 5, 1, 7, 9, 80, 12};
        int[] result = CountingSort.sort(nums);
        for (int num : result) {
            System.out.println(num);

        }

    }

    @Test
    public void test() throws IOException {
        String source = "{\n" +
                "    \"data\": [\n" +
                "        {\n" +
                "            \"tel_code\": \"297\",\n" +
                "            \"country_code\": \"ABW\",\n" +
                "            \"country\": \"阿鲁巴\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"93\",\n" +
                "            \"country_code\": \"AFG\",\n" +
                "            \"country\": \"阿富汗\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"244\",\n" +
                "            \"country_code\": \"AGO\",\n" +
                "            \"country\": \"安哥拉\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"355\",\n" +
                "            \"country_code\": \"ALB\",\n" +
                "            \"country\": \"阿尔巴尼亚\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"376\",\n" +
                "            \"country_code\": \"AND\",\n" +
                "            \"country\": \"安道尔\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"599\",\n" +
                "            \"country_code\": \"ANT\",\n" +
                "            \"country\": \"荷属安的列斯\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"971\",\n" +
                "            \"country_code\": \"ARE\",\n" +
                "            \"country\": \"阿拉伯联合酋长国\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"54\",\n" +
                "            \"country_code\": \"ARG\",\n" +
                "            \"country\": \"阿根廷\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"374\",\n" +
                "            \"country_code\": \"ARM\",\n" +
                "            \"country\": \"亚美尼亚\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"672\",\n" +
                "            \"country_code\": \"ATA\",\n" +
                "            \"country\": \"南极洲\"\n" +
                "        },\n" +
                "        \n" +
                "      \n" +
                "        {\n" +
                "            \"tel_code\": \"994\",\n" +
                "            \"country_code\": \"AZE\",\n" +
                "            \"country\": \"阿塞拜疆\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"257\",\n" +
                "            \"country_code\": \"BDI\",\n" +
                "            \"country\": \"布隆迪\"\n" +
                "        },\n" +
                "        \n" +
                "        {\n" +
                "            \"tel_code\": \"229\",\n" +
                "            \"country_code\": \"BEN\",\n" +
                "            \"country\": \"贝宁\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"226\",\n" +
                "            \"country_code\": \"BFA\",\n" +
                "            \"country\": \"布基纳法索\"\n" +
                "        },\n" +
                "      \n" +
                "      \n" +
                "        {\n" +
                "            \"tel_code\": \"973\",\n" +
                "            \"country_code\": \"BHR\",\n" +
                "            \"country\": \"巴林\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"387\",\n" +
                "            \"country_code\": \"BIH\",\n" +
                "            \"country\": \"波斯尼亚和黑塞哥维那\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"590\",\n" +
                "            \"country_code\": \"BLM\",\n" +
                "            \"country\": \"圣巴泰勒米\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"375\",\n" +
                "            \"country_code\": \"BLR\",\n" +
                "            \"country\": \"白俄罗斯\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"501\",\n" +
                "            \"country_code\": \"BLZ\",\n" +
                "            \"country\": \"伯利兹\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"591\",\n" +
                "            \"country_code\": \"BOL\",\n" +
                "            \"country\": \"玻利维亚\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"55\",\n" +
                "            \"country_code\": \"BRA\",\n" +
                "            \"country\": \"巴西\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"673\",\n" +
                "            \"country_code\": \"BRN\",\n" +
                "            \"country\": \"文莱\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"975\",\n" +
                "            \"country_code\": \"BTN\",\n" +
                "            \"country\": \"不丹\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"267\",\n" +
                "            \"country_code\": \"BWA\",\n" +
                "            \"country\": \"博茨瓦纳\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"236\",\n" +
                "            \"country_code\": \"CAF\",\n" +
                "            \"country\": \"中非共和国\"\n" +
                "        },\n" +
                "      \n" +
                "        {\n" +
                "            \"tel_code\": \"61\",\n" +
                "            \"country_code\": \"CCK\",\n" +
                "            \"country\": \"科科斯群岛\"\n" +
                "        },\n" +
                "       \n" +
                "        {\n" +
                "            \"tel_code\": \"56\",\n" +
                "            \"country_code\": \"CHL\",\n" +
                "            \"country\": \"智利\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"225\",\n" +
                "            \"country_code\": \"CIV\",\n" +
                "            \"country\": \"科特迪瓦\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"237\",\n" +
                "            \"country_code\": \"CMR\",\n" +
                "            \"country\": \"喀麦隆\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"243\",\n" +
                "            \"country_code\": \"COD\",\n" +
                "            \"country\": \"刚果民主共和国\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"242\",\n" +
                "            \"country_code\": \"COG\",\n" +
                "            \"country\": \"刚果共和国\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"682\",\n" +
                "            \"country_code\": \"COK\",\n" +
                "            \"country\": \"库克群岛\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"57\",\n" +
                "            \"country_code\": \"COL\",\n" +
                "            \"country\": \"哥伦比亚\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"269\",\n" +
                "            \"country_code\": \"COM\",\n" +
                "            \"country\": \"科摩罗\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"238\",\n" +
                "            \"country_code\": \"CPV\",\n" +
                "            \"country\": \"佛得角\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"506\",\n" +
                "            \"country_code\": \"CRI\",\n" +
                "            \"country\": \"哥斯达黎加\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"53\",\n" +
                "            \"country_code\": \"CUB\",\n" +
                "            \"country\": \"古巴\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"599\",\n" +
                "            \"country_code\": \"CUW\",\n" +
                "            \"country\": \"库拉索\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"61\",\n" +
                "            \"country_code\": \"CXR\",\n" +
                "            \"country\": \"圣诞岛\"\n" +
                "        },\n" +
                "        \n" +
                "     \n" +
                "        \n" +
                "        {\n" +
                "            \"tel_code\": \"253\",\n" +
                "            \"country_code\": \"DJI\",\n" +
                "            \"country\": \"吉布提\"\n" +
                "        },\n" +
                "        \n" +
                "        {\n" +
                "            \"tel_code\": \"213\",\n" +
                "            \"country_code\": \"DZA\",\n" +
                "            \"country\": \"阿尔及利亚\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"593\",\n" +
                "            \"country_code\": \"ECU\",\n" +
                "            \"country\": \"厄瓜多尔\"\n" +
                "        },\n" +
                "        \n" +
                "        {\n" +
                "            \"tel_code\": \"291\",\n" +
                "            \"country_code\": \"ERI\",\n" +
                "            \"country\": \"厄立特里亚\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"212\",\n" +
                "            \"country_code\": \"ESH\",\n" +
                "            \"country\": \"撒哈拉沙漠西部\"\n" +
                "        },\n" +
                "        \n" +
                "       \n" +
                "        {\n" +
                "            \"tel_code\": \"251\",\n" +
                "            \"country_code\": \"ETH\",\n" +
                "            \"country\": \"埃塞俄比亚\"\n" +
                "        },\n" +
                "       \n" +
                "        {\n" +
                "            \"tel_code\": \"679\",\n" +
                "            \"country_code\": \"FJI\",\n" +
                "            \"country\": \"斐济\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"500\",\n" +
                "            \"country_code\": \"FLK\",\n" +
                "            \"country\": \"福克兰群岛\"\n" +
                "        },\n" +
                "       \n" +
                "        {\n" +
                "            \"tel_code\": \"298\",\n" +
                "            \"country_code\": \"FRO\",\n" +
                "            \"country\": \"法罗群岛\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"691\",\n" +
                "            \"country_code\": \"FSM\",\n" +
                "            \"country\": \"密克罗尼西亚\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"241\",\n" +
                "            \"country_code\": \"GAB\",\n" +
                "            \"country\": \"加蓬\"\n" +
                "        },\n" +
                "       \n" +
                "        {\n" +
                "            \"tel_code\": \"995\",\n" +
                "            \"country_code\": \"GEO\",\n" +
                "            \"country\": \"格鲁吉亚\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"233\",\n" +
                "            \"country_code\": \"GHA\",\n" +
                "            \"country\": \"加纳\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"350\",\n" +
                "            \"country_code\": \"GIB\",\n" +
                "            \"country\": \"直布罗陀\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"224\",\n" +
                "            \"country_code\": \"GIN\",\n" +
                "            \"country\": \"几内亚\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"220\",\n" +
                "            \"country_code\": \"GMB\",\n" +
                "            \"country\": \"冈比亚\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"245\",\n" +
                "            \"country_code\": \"GNB\",\n" +
                "            \"country\": \"几内亚比绍\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"240\",\n" +
                "            \"country_code\": \"GNQ\",\n" +
                "            \"country\": \"赤道几内亚\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"30\",\n" +
                "            \"country_code\": \"GRC\",\n" +
                "            \"country\": \"希腊\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"299\",\n" +
                "            \"country_code\": \"GRL\",\n" +
                "            \"country\": \"格陵兰\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"502\",\n" +
                "            \"country_code\": \"GTM\",\n" +
                "            \"country\": \"危地马拉\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"592\",\n" +
                "            \"country_code\": \"GUY\",\n" +
                "            \"country\": \"圭亚那\"\n" +
                "        },\n" +
                "      \n" +
                "        {\n" +
                "            \"tel_code\": \"504\",\n" +
                "            \"country_code\": \"HND\",\n" +
                "            \"country\": \"洪都拉斯\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"385\",\n" +
                "            \"country_code\": \"HRV\",\n" +
                "            \"country\": \"克罗地亚\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"509\",\n" +
                "            \"country_code\": \"HTI\",\n" +
                "            \"country\": \"海地\"\n" +
                "        },\n" +
                "       \n" +
                "       \n" +
                "     \n" +
                "        {\n" +
                "            \"tel_code\": \"246\",\n" +
                "            \"country_code\": \"IOT\",\n" +
                "            \"country\": \"英属印度洋领地\"\n" +
                "        },\n" +
                "       \n" +
                "        {\n" +
                "            \"tel_code\": \"98\",\n" +
                "            \"country_code\": \"IRN\",\n" +
                "            \"country\": \"伊朗\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"964\",\n" +
                "            \"country_code\": \"IRQ\",\n" +
                "            \"country\": \"伊拉克\"\n" +
                "        },\n" +
                "      \n" +
                "        {\n" +
                "            \"tel_code\": \"962\",\n" +
                "            \"country_code\": \"JOR\",\n" +
                "            \"country\": \"约旦\"\n" +
                "        },\n" +
                "      \n" +
                "        {\n" +
                "            \"tel_code\": \"254\",\n" +
                "            \"country_code\": \"KEN\",\n" +
                "            \"country\": \"肯尼亚\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"996\",\n" +
                "            \"country_code\": \"KGZ\",\n" +
                "            \"country\": \"吉尔吉斯斯坦\"\n" +
                "        },\n" +
                "       \n" +
                "        {\n" +
                "            \"tel_code\": \"686\",\n" +
                "            \"country_code\": \"KIR\",\n" +
                "            \"country\": \"基里巴斯\"\n" +
                "        },\n" +
                "       \n" +
                "        {\n" +
                "            \"tel_code\": \"965\",\n" +
                "            \"country_code\": \"KWT\",\n" +
                "            \"country\": \"科威特\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"856\",\n" +
                "            \"country_code\": \"LAO\",\n" +
                "            \"country\": \"老挝\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"961\",\n" +
                "            \"country_code\": \"LBN\",\n" +
                "            \"country\": \"黎巴嫩\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"231\",\n" +
                "            \"country_code\": \"LBR\",\n" +
                "            \"country\": \"利比里亚\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"218\",\n" +
                "            \"country_code\": \"LBY\",\n" +
                "            \"country\": \"利比亚\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"423\",\n" +
                "            \"country_code\": \"LIE\",\n" +
                "            \"country\": \"列支敦士登\"\n" +
                "        },\n" +
                "        \n" +
                "        {\n" +
                "            \"tel_code\": \"266\",\n" +
                "            \"country_code\": \"LSO\",\n" +
                "            \"country\": \"莱索托\"\n" +
                "        },\n" +
                "        \n" +
                "      \n" +
                "       \n" +
                "        {\n" +
                "            \"tel_code\": \"853\",\n" +
                "            \"country_code\": \"MAC\",\n" +
                "            \"country\": \"澳门特别行政区\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"590\",\n" +
                "            \"country_code\": \"MAF\",\n" +
                "            \"country\": \"圣马丁\"\n" +
                "        },\n" +
                "        \n" +
                "        {\n" +
                "            \"tel_code\": \"377\",\n" +
                "            \"country_code\": \"MCO\",\n" +
                "            \"country\": \"摩纳哥\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"373\",\n" +
                "            \"country_code\": \"MDA\",\n" +
                "            \"country\": \"摩尔多瓦\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"261\",\n" +
                "            \"country_code\": \"MDG\",\n" +
                "            \"country\": \"马达加斯加\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"960\",\n" +
                "            \"country_code\": \"MDV\",\n" +
                "            \"country\": \"马尔代夫\"\n" +
                "        },\n" +
                "       \n" +
                "        {\n" +
                "            \"tel_code\": \"692\",\n" +
                "            \"country_code\": \"MHL\",\n" +
                "            \"country\": \"马绍尔群岛\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"389\",\n" +
                "            \"country_code\": \"MKD\",\n" +
                "            \"country\": \"马其顿\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"223\",\n" +
                "            \"country_code\": \"MLI\",\n" +
                "            \"country\": \"马里\"\n" +
                "        },\n" +
                "       \n" +
                "        \n" +
                "        {\n" +
                "            \"tel_code\": \"382\",\n" +
                "            \"country_code\": \"MNE\",\n" +
                "            \"country\": \"黑山\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"976\",\n" +
                "            \"country_code\": \"MNG\",\n" +
                "            \"country\": \"蒙古\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"258\",\n" +
                "            \"country_code\": \"MOZ\",\n" +
                "            \"country\": \"莫桑比克\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"222\",\n" +
                "            \"country_code\": \"MRT\",\n" +
                "            \"country\": \"毛里塔尼亚\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"230\",\n" +
                "            \"country_code\": \"MUS\",\n" +
                "            \"country\": \"毛里求斯\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"265\",\n" +
                "            \"country_code\": \"MWI\",\n" +
                "            \"country\": \"马拉维\"\n" +
                "        },\n" +
                "        \n" +
                "        {\n" +
                "            \"tel_code\": \"262\",\n" +
                "            \"country_code\": \"MYT\",\n" +
                "            \"country\": \"马约特\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"264\",\n" +
                "            \"country_code\": \"NAM\",\n" +
                "            \"country\": \"纳米比亚\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"687\",\n" +
                "            \"country_code\": \"NCL\",\n" +
                "            \"country\": \"新喀里多尼亚\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"227\",\n" +
                "            \"country_code\": \"NER\",\n" +
                "            \"country\": \"尼日尔\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"234\",\n" +
                "            \"country_code\": \"NGA\",\n" +
                "            \"country\": \"尼日利亚\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"505\",\n" +
                "            \"country_code\": \"NIC\",\n" +
                "            \"country\": \"尼加拉瓜\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"683\",\n" +
                "            \"country_code\": \"NIU\",\n" +
                "            \"country\": \"纽埃\"\n" +
                "        },\n" +
                "        \n" +
                "      \n" +
                "        {\n" +
                "            \"tel_code\": \"977\",\n" +
                "            \"country_code\": \"NPL\",\n" +
                "            \"country\": \"尼泊尔\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"674\",\n" +
                "            \"country_code\": \"NRU\",\n" +
                "            \"country\": \"瑙鲁\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"968\",\n" +
                "            \"country_code\": \"OMN\",\n" +
                "            \"country\": \"阿曼\"\n" +
                "        },\n" +
                "       \n" +
                "        {\n" +
                "            \"tel_code\": \"507\",\n" +
                "            \"country_code\": \"PAN\",\n" +
                "            \"country\": \"巴拿马\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"64\",\n" +
                "            \"country_code\": \"PCN\",\n" +
                "            \"country\": \"皮特凯恩\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"51\",\n" +
                "            \"country_code\": \"PER\",\n" +
                "            \"country\": \"秘鲁\"\n" +
                "        },\n" +
                "       \n" +
                "        {\n" +
                "            \"tel_code\": \"680\",\n" +
                "            \"country_code\": \"PLW\",\n" +
                "            \"country\": \"帕劳\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"675\",\n" +
                "            \"country_code\": \"PNG\",\n" +
                "            \"country\": \"巴布亚新几内亚\"\n" +
                "        },\n" +
                "       \n" +
                "        {\n" +
                "            \"tel_code\": \"850\",\n" +
                "            \"country_code\": \"PRK\",\n" +
                "            \"country\": \"北朝鲜\"\n" +
                "        },\n" +
                "       \n" +
                "        {\n" +
                "            \"tel_code\": \"595\",\n" +
                "            \"country_code\": \"PRY\",\n" +
                "            \"country\": \"巴拉圭\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"970\",\n" +
                "            \"country_code\": \"PSE\",\n" +
                "            \"country\": \"巴勒斯坦\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"689\",\n" +
                "            \"country_code\": \"PYF\",\n" +
                "            \"country\": \"法属波利尼西亚\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"974\",\n" +
                "            \"country_code\": \"QAT\",\n" +
                "            \"country\": \"卡塔尔\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"262\",\n" +
                "            \"country_code\": \"REU\",\n" +
                "            \"country\": \"留尼汪\"\n" +
                "        },\n" +
                "        \n" +
                "       \n" +
                "        {\n" +
                "            \"tel_code\": \"250\",\n" +
                "            \"country_code\": \"RWA\",\n" +
                "            \"country\": \"卢旺达\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"966\",\n" +
                "            \"country_code\": \"SAU\",\n" +
                "            \"country\": \"沙特阿拉伯\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"249\",\n" +
                "            \"country_code\": \"SDN\",\n" +
                "            \"country\": \"苏丹\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"221\",\n" +
                "            \"country_code\": \"SEN\",\n" +
                "            \"country\": \"塞内加尔\"\n" +
                "        },\n" +
                "       \n" +
                "        {\n" +
                "            \"tel_code\": \"290\",\n" +
                "            \"country_code\": \"SHN\",\n" +
                "            \"country\": \"圣赫勒拿\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"47\",\n" +
                "            \"country_code\": \"SJM\",\n" +
                "            \"country\": \"斯瓦尔巴和扬马延\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"677\",\n" +
                "            \"country_code\": \"SLB\",\n" +
                "            \"country\": \"所罗门群岛\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"232\",\n" +
                "            \"country_code\": \"SLE\",\n" +
                "            \"country\": \"塞拉利昂\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"503\",\n" +
                "            \"country_code\": \"SLV\",\n" +
                "            \"country\": \"萨尔瓦多\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"378\",\n" +
                "            \"country_code\": \"SMR\",\n" +
                "            \"country\": \"圣马力诺\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"252\",\n" +
                "            \"country_code\": \"SOM\",\n" +
                "            \"country\": \"索马里\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"508\",\n" +
                "            \"country_code\": \"SPM\",\n" +
                "            \"country\": \"圣皮埃尔和密克隆\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"381\",\n" +
                "            \"country_code\": \"SRB\",\n" +
                "            \"country\": \"塞尔维亚\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"211\",\n" +
                "            \"country_code\": \"SSD\",\n" +
                "            \"country\": \"南苏丹\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"239\",\n" +
                "            \"country_code\": \"STP\",\n" +
                "            \"country\": \"圣多美和普林西比\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"597\",\n" +
                "            \"country_code\": \"SUR\",\n" +
                "            \"country\": \"苏里南\"\n" +
                "        },\n" +
                "       \n" +
                "       \n" +
                "      \n" +
                "        {\n" +
                "            \"tel_code\": \"268\",\n" +
                "            \"country_code\": \"SWZ\",\n" +
                "            \"country\": \"斯威士兰\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"248\",\n" +
                "            \"country_code\": \"SYC\",\n" +
                "            \"country\": \"塞舌尔\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"963\",\n" +
                "            \"country_code\": \"SYR\",\n" +
                "            \"country\": \"叙利亚\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"235\",\n" +
                "            \"country_code\": \"TCD\",\n" +
                "            \"country\": \"乍得\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"228\",\n" +
                "            \"country_code\": \"TGO\",\n" +
                "            \"country\": \"多哥\"\n" +
                "        },\n" +
                "       \n" +
                "        {\n" +
                "            \"tel_code\": \"992\",\n" +
                "            \"country_code\": \"TJK\",\n" +
                "            \"country\": \"塔吉克斯坦\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"690\",\n" +
                "            \"country_code\": \"TKL\",\n" +
                "            \"country\": \"托克劳\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"993\",\n" +
                "            \"country_code\": \"TKM\",\n" +
                "            \"country\": \"土库曼斯坦\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"670\",\n" +
                "            \"country_code\": \"TLS\",\n" +
                "            \"country\": \"东帝汶\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"676\",\n" +
                "            \"country_code\": \"TON\",\n" +
                "            \"country\": \"汤加\"\n" +
                "        },\n" +
                "       \n" +
                "      \n" +
                "        {\n" +
                "            \"tel_code\": \"688\",\n" +
                "            \"country_code\": \"TUV\",\n" +
                "            \"country\": \"图瓦卢\"\n" +
                "        },\n" +
                "        \n" +
                "        {\n" +
                "            \"tel_code\": \"255\",\n" +
                "            \"country_code\": \"TZA\",\n" +
                "            \"country\": \"坦桑尼亚\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"256\",\n" +
                "            \"country_code\": \"UGA\",\n" +
                "            \"country\": \"乌干达\"\n" +
                "        },\n" +
                "        \n" +
                "        {\n" +
                "            \"tel_code\": \"598\",\n" +
                "            \"country_code\": \"URY\",\n" +
                "            \"country\": \"乌拉圭\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"1\",\n" +
                "            \"country_code\": \"USA\",\n" +
                "            \"country\": \"美国\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"998\",\n" +
                "            \"country_code\": \"UZB\",\n" +
                "            \"country\": \"乌兹别克斯坦\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"379\",\n" +
                "            \"country_code\": \"VAT\",\n" +
                "            \"country\": \"梵蒂冈\"\n" +
                "        },\n" +
                "      \n" +
                "       {\n" +
                "            \"tel_code\": \"678\",\n" +
                "            \"country_code\": \"VUT\",\n" +
                "            \"country\": \"瓦努阿图\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"681\",\n" +
                "            \"country_code\": \"WLF\",\n" +
                "            \"country\": \"瓦利斯和富图纳\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"685\",\n" +
                "            \"country_code\": \"WSM\",\n" +
                "            \"country\": \"萨摩亚\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"383\",\n" +
                "            \"country_code\": \"XKX\",\n" +
                "            \"country\": \"科索沃\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"967\",\n" +
                "            \"country_code\": \"YEM\",\n" +
                "            \"country\": \"也门\"\n" +
                "        },\n" +
                "       \n" +
                "        {\n" +
                "            \"tel_code\": \"260\",\n" +
                "            \"country_code\": \"ZMB\",\n" +
                "            \"country\": \"赞比亚\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"263\",\n" +
                "            \"country_code\": \"ZWE\",\n" +
                "            \"country\": \"津巴布韦\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"tel_code\": \"1-284\",\n" +
                "            \"country_code\": \"VGB\",\n" +
                "            \"country\": \"英属维尔京群岛\"\n" +
                "        },\n" +
                "       \n" +
                "        {\n" +
                "            \"tel_code\": \"1-684\",\n" +
                "            \"country_code\": \"ASM\",\n" +
                "            \"country\": \"美属萨摩亚\"\n" +
                "        }\n" +
                "    ],\n" +
                "    \"is_succ\": true\n" +
                "}\n";

        String dest = "{\n" +
                "    \"data\": [\n" +
                "        {\n" +
                "            \"country\": \"阿富汗\",\n" +
                "            \"country_code\": \"AFG\",\n" +
                "            \"tel_code\": 93\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"阿尔巴尼亚\",\n" +
                "            \"country_code\": \"ALB\",\n" +
                "            \"tel_code\": 355\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"阿尔及利亚\",\n" +
                "            \"country_code\": \"DZA\",\n" +
                "            \"tel_code\": 213\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"美属萨摩亚\",\n" +
                "            \"country_code\": \"ASM\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"安道尔\",\n" +
                "            \"country_code\": \"AND\",\n" +
                "            \"tel_code\": 376\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"安哥拉\",\n" +
                "            \"country_code\": \"AGO\",\n" +
                "            \"tel_code\": 244\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"安圭拉岛\",\n" +
                "            \"country_code\": \"AIA\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"南极洲\",\n" +
                "            \"country_code\": \"ATA\",\n" +
                "            \"tel_code\": 672\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"安提瓜和巴布达\",\n" +
                "            \"country_code\": \"ATG\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"阿根廷\",\n" +
                "            \"country_code\": \"ARG\",\n" +
                "            \"tel_code\": 54\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"亚美尼亚\",\n" +
                "            \"country_code\": \"ARM\",\n" +
                "            \"tel_code\": 374\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"阿鲁巴\",\n" +
                "            \"country_code\": \"ABW\",\n" +
                "            \"tel_code\": 297\n" +
                "        },\n" +
                "       \n" +
                "       \n" +
                "        {\n" +
                "            \"country\": \"阿塞拜疆\",\n" +
                "            \"country_code\": \"AZE\",\n" +
                "            \"tel_code\": 994\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"巴哈马\",\n" +
                "            \"country_code\": \"BHS\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"巴林\",\n" +
                "            \"country_code\": \"BHR\",\n" +
                "            \"tel_code\": 973\n" +
                "        },\n" +
                "        \n" +
                "        {\n" +
                "            \"country\": \"巴巴多斯\",\n" +
                "            \"country_code\": \"BRB\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"白俄罗斯\",\n" +
                "            \"country_code\": \"BLR\",\n" +
                "            \"tel_code\": 375\n" +
                "        },\n" +
                "       \n" +
                "        {\n" +
                "            \"country\": \"伯利兹\",\n" +
                "            \"country_code\": \"BLZ\",\n" +
                "            \"tel_code\": 501\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"贝宁\",\n" +
                "            \"country_code\": \"BEN\",\n" +
                "            \"tel_code\": 229\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"百慕大\",\n" +
                "            \"country_code\": \"BMU\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"不丹\",\n" +
                "            \"country_code\": \"BTN\",\n" +
                "            \"tel_code\": 975\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"玻利维亚\",\n" +
                "            \"country_code\": \"BOL\",\n" +
                "            \"tel_code\": 591\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"波斯尼亚和黑塞哥维那\",\n" +
                "            \"country_code\": \"BIH\",\n" +
                "            \"tel_code\": 387\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"博茨瓦纳\",\n" +
                "            \"country_code\": \"BWA\",\n" +
                "            \"tel_code\": 267\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"巴西\",\n" +
                "            \"country_code\": \"BRA\",\n" +
                "            \"tel_code\": 55\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"英属印度洋领地\",\n" +
                "            \"country_code\": \"IOT\",\n" +
                "            \"tel_code\": 246\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"英属维尔京群岛\",\n" +
                "            \"country_code\": \"VGB\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"文莱\",\n" +
                "            \"country_code\": \"BRN\",\n" +
                "            \"tel_code\": 673\n" +
                "        },\n" +
                "       \n" +
                "        {\n" +
                "            \"country\": \"布基纳法索\",\n" +
                "            \"country_code\": \"BFA\",\n" +
                "            \"tel_code\": 226\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"布隆迪\",\n" +
                "            \"country_code\": \"BDI\",\n" +
                "            \"tel_code\": 257\n" +
                "        },\n" +
                "       \n" +
                "        {\n" +
                "            \"country\": \"喀麦隆\",\n" +
                "            \"country_code\": \"CMR\",\n" +
                "            \"tel_code\": 237\n" +
                "        },\n" +
                "        \n" +
                "        {\n" +
                "            \"country\": \"佛得角\",\n" +
                "            \"country_code\": \"CPV\",\n" +
                "            \"tel_code\": 238\n" +
                "        },\n" +
                "       \n" +
                "        {\n" +
                "            \"country\": \"中非共和国\",\n" +
                "            \"country_code\": \"CAF\",\n" +
                "            \"tel_code\": 236\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"乍得\",\n" +
                "            \"country_code\": \"TCD\",\n" +
                "            \"tel_code\": 235\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"智利\",\n" +
                "            \"country_code\": \"CHL\",\n" +
                "            \"tel_code\": 56\n" +
                "        },\n" +
                "       \n" +
                "        {\n" +
                "            \"country\": \"圣诞岛\",\n" +
                "            \"country_code\": \"CXR\",\n" +
                "            \"tel_code\": 61\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"科科斯群岛\",\n" +
                "            \"country_code\": \"CCK\",\n" +
                "            \"tel_code\": 61\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"哥伦比亚\",\n" +
                "            \"country_code\": \"COL\",\n" +
                "            \"tel_code\": 57\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"科摩罗\",\n" +
                "            \"country_code\": \"COM\",\n" +
                "            \"tel_code\": 269\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"库克群岛\",\n" +
                "            \"country_code\": \"COK\",\n" +
                "            \"tel_code\": 682\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"哥斯达黎加\",\n" +
                "            \"country_code\": \"CRI\",\n" +
                "            \"tel_code\": 506\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"克罗地亚\",\n" +
                "            \"country_code\": \"HRV\",\n" +
                "            \"tel_code\": 385\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"古巴\",\n" +
                "            \"country_code\": \"CUB\",\n" +
                "            \"tel_code\": 53\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"库拉索岛\",\n" +
                "            \"country_code\": \"CUW\",\n" +
                "            \"tel_code\": 599\n" +
                "        },\n" +
                "        \n" +
                "       \n" +
                "        {\n" +
                "            \"country\": \"刚果民主共和国\",\n" +
                "            \"country_code\": \"COD\",\n" +
                "            \"tel_code\": 243\n" +
                "        },\n" +
                "        \n" +
                "        {\n" +
                "            \"country\": \"吉布提\",\n" +
                "            \"country_code\": \"DJI\",\n" +
                "            \"tel_code\": 253\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"多米尼加\",\n" +
                "            \"country_code\": \"DMA\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"多米尼加共和国\",\n" +
                "            \"country_code\": \"DOM\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"东帝汶\",\n" +
                "            \"country_code\": \"TLS\",\n" +
                "            \"tel_code\": 670\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"厄瓜多尔\",\n" +
                "            \"country_code\": \"ECU\",\n" +
                "            \"tel_code\": 593\n" +
                "        },\n" +
                "        \n" +
                "        {\n" +
                "            \"country\": \"萨尔瓦多\",\n" +
                "            \"country_code\": \"SLV\",\n" +
                "            \"tel_code\": 503\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"赤道几内亚\",\n" +
                "            \"country_code\": \"GNQ\",\n" +
                "            \"tel_code\": 240\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"厄立特里亚\",\n" +
                "            \"country_code\": \"ERI\",\n" +
                "            \"tel_code\": 291\n" +
                "        },\n" +
                "        \n" +
                "        {\n" +
                "            \"country\": \"埃塞俄比亚\",\n" +
                "            \"country_code\": \"ETH\",\n" +
                "            \"tel_code\": 251\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"福克兰群岛\",\n" +
                "            \"country_code\": \"FLK\",\n" +
                "            \"tel_code\": 500\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"法罗群岛\",\n" +
                "            \"country_code\": \"FRO\",\n" +
                "            \"tel_code\": 298\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"斐济\",\n" +
                "            \"country_code\": \"FJI\",\n" +
                "            \"tel_code\": 679\n" +
                "        },\n" +
                "       \n" +
                "       \n" +
                "        {\n" +
                "            \"country\": \"法属波利尼西亚\",\n" +
                "            \"country_code\": \"PYF\",\n" +
                "            \"tel_code\": 689\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"加蓬\",\n" +
                "            \"country_code\": \"GAB\",\n" +
                "            \"tel_code\": 241\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"冈比亚\",\n" +
                "            \"country_code\": \"GMB\",\n" +
                "            \"tel_code\": 220\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"格鲁吉亚\",\n" +
                "            \"country_code\": \"GEO\",\n" +
                "            \"tel_code\": 995\n" +
                "        },\n" +
                "        \n" +
                "        {\n" +
                "            \"country\": \"加纳\",\n" +
                "            \"country_code\": \"GHA\",\n" +
                "            \"tel_code\": 233\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"直布罗陀\",\n" +
                "            \"country_code\": \"GIB\",\n" +
                "            \"tel_code\": 350\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"希腊\",\n" +
                "            \"country_code\": \"GRC\",\n" +
                "            \"tel_code\": 30\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"格陵兰\",\n" +
                "            \"country_code\": \"GRL\",\n" +
                "            \"tel_code\": 299\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"格林纳达\",\n" +
                "            \"country_code\": \"GRD\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"关岛\",\n" +
                "            \"country_code\": \"GUM\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"危地马拉\",\n" +
                "            \"country_code\": \"GTM\",\n" +
                "            \"tel_code\": 502\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"格恩西岛\",\n" +
                "            \"country_code\": \"GGY\",\n" +
                "            \"tel_code\": 44\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"几内亚\",\n" +
                "            \"country_code\": \"GIN\",\n" +
                "            \"tel_code\": 224\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"几内亚比绍\",\n" +
                "            \"country_code\": \"GNB\",\n" +
                "            \"tel_code\": 245\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"圭亚那\",\n" +
                "            \"country_code\": \"GUY\",\n" +
                "            \"tel_code\": 592\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"海地\",\n" +
                "            \"country_code\": \"HTI\",\n" +
                "            \"tel_code\": 509\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"洪都拉斯\",\n" +
                "            \"country_code\": \"HND\",\n" +
                "            \"tel_code\": 504\n" +
                "        },\n" +
                "       \n" +
                "   \n" +
                "       \n" +
                "{\n" +
                "            \"country\": \"伊朗\",\n" +
                "            \"country_code\": \"IRN\",\n" +
                "            \"tel_code\": 98\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"伊拉克\",\n" +
                "            \"country_code\": \"IRQ\",\n" +
                "            \"tel_code\": 964\n" +
                "        },\n" +
                "       \n" +
                "        {\n" +
                "            \"country\": \"马恩岛\",\n" +
                "            \"country_code\": \"IMN\",\n" +
                "            \"tel_code\": 44\n" +
                "        },\n" +
                "        \n" +
                "      \n" +
                "        {\n" +
                "            \"country\": \"科特迪瓦\",\n" +
                "            \"country_code\": \"CIV\",\n" +
                "            \"tel_code\": 225\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"牙买加\",\n" +
                "            \"country_code\": \"JAM\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "        \n" +
                "        {\n" +
                "            \"country\": \"泽西岛\",\n" +
                "            \"country_code\": \"JEY\",\n" +
                "            \"tel_code\": 44\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"约旦\",\n" +
                "            \"country_code\": \"JOR\",\n" +
                "            \"tel_code\": 962\n" +
                "        },\n" +
                "       \n" +
                "        {\n" +
                "            \"country\": \"肯尼亚\",\n" +
                "            \"country_code\": \"KEN\",\n" +
                "            \"tel_code\": 254\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"基里巴斯\",\n" +
                "            \"country_code\": \"KIR\",\n" +
                "            \"tel_code\": 686\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"科索沃\",\n" +
                "            \"country_code\": \"XKX\",\n" +
                "            \"tel_code\": 383\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"科威特\",\n" +
                "            \"country_code\": \"KWT\",\n" +
                "            \"tel_code\": 965\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"吉尔吉斯斯坦\",\n" +
                "            \"country_code\": \"KGZ\",\n" +
                "            \"tel_code\": 996\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"老挝\",\n" +
                "            \"country_code\": \"LAO\",\n" +
                "            \"tel_code\": 856\n" +
                "        },\n" +
                "      \n" +
                "        {\n" +
                "            \"country\": \"黎巴嫩\",\n" +
                "            \"country_code\": \"LBN\",\n" +
                "            \"tel_code\": 961\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"莱索托\",\n" +
                "            \"country_code\": \"LSO\",\n" +
                "            \"tel_code\": 266\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"利比里亚\",\n" +
                "            \"country_code\": \"LBR\",\n" +
                "            \"tel_code\": 231\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"利比亚\",\n" +
                "            \"country_code\": \"LBY\",\n" +
                "            \"tel_code\": 218\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"列支敦士登\",\n" +
                "            \"country_code\": \"LIE\",\n" +
                "            \"tel_code\": 423\n" +
                "        },\n" +
                "      \n" +
                "       \n" +
                "        {\n" +
                "            \"country\": \"澳门特别行政区\",\n" +
                "            \"country_code\": \"MAC\",\n" +
                "            \"tel_code\": 853\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"马其顿\",\n" +
                "            \"country_code\": \"MKD\",\n" +
                "            \"tel_code\": 389\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"马达加斯加\",\n" +
                "            \"country_code\": \"MDG\",\n" +
                "            \"tel_code\": 261\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"马拉维\",\n" +
                "            \"country_code\": \"MWI\",\n" +
                "            \"tel_code\": 265\n" +
                "        },\n" +
                "       \n" +
                "        {\n" +
                "            \"country\": \"马尔代夫\",\n" +
                "            \"country_code\": \"MDV\",\n" +
                "            \"tel_code\": 960\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"马里\",\n" +
                "            \"country_code\": \"MLI\",\n" +
                "            \"tel_code\": 223\n" +
                "        },\n" +
                "       \n" +
                "        {\n" +
                "            \"country\": \"马绍尔群岛\",\n" +
                "            \"country_code\": \"MHL\",\n" +
                "            \"tel_code\": 692\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"毛里塔尼亚\",\n" +
                "            \"country_code\": \"MRT\",\n" +
                "            \"tel_code\": 222\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"毛里求斯\",\n" +
                "            \"country_code\": \"MUS\",\n" +
                "            \"tel_code\": 230\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"马约特\",\n" +
                "            \"country_code\": \"MYT\",\n" +
                "            \"tel_code\": 262\n" +
                "        },\n" +
                "      \n" +
                "        {\n" +
                "            \"country\": \"密克罗尼西亚\",\n" +
                "            \"country_code\": \"FSM\",\n" +
                "            \"tel_code\": 691\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"摩尔多瓦\",\n" +
                "            \"country_code\": \"MDA\",\n" +
                "            \"tel_code\": 373\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"摩纳哥\",\n" +
                "            \"country_code\": \"MCO\",\n" +
                "            \"tel_code\": 377\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"蒙古\",\n" +
                "            \"country_code\": \"MNG\",\n" +
                "            \"tel_code\": 976\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"黑山\",\n" +
                "            \"country_code\": \"MNE\",\n" +
                "            \"tel_code\": 382\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"蒙特塞拉特\",\n" +
                "            \"country_code\": \"MSR\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "      \n" +
                "        {\n" +
                "            \"country\": \"莫桑比克\",\n" +
                "            \"country_code\": \"MOZ\",\n" +
                "            \"tel_code\": 258\n" +
                "        },\n" +
                "        \n" +
                "        {\n" +
                "            \"country\": \"纳米比亚\",\n" +
                "            \"country_code\": \"NAM\",\n" +
                "            \"tel_code\": 264\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"瑙鲁\",\n" +
                "            \"country_code\": \"NRU\",\n" +
                "            \"tel_code\": 674\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"尼泊尔\",\n" +
                "            \"country_code\": \"NPL\",\n" +
                "            \"tel_code\": 977\n" +
                "        },\n" +
                "      \n" +
                "        {\n" +
                "            \"country\": \"荷属安的列斯群岛\",\n" +
                "            \"country_code\": \"ANT\",\n" +
                "            \"tel_code\": 599\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"新喀里多尼亚\",\n" +
                "            \"country_code\": \"NCL\",\n" +
                "            \"tel_code\": 687\n" +
                "        },\n" +
                "        \n" +
                "        {\n" +
                "            \"country\": \"尼加拉瓜\",\n" +
                "            \"country_code\": \"NIC\",\n" +
                "            \"tel_code\": 505\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"尼日尔\",\n" +
                "            \"country_code\": \"NER\",\n" +
                "            \"tel_code\": 227\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"尼日利亚\",\n" +
                "            \"country_code\": \"NGA\",\n" +
                "            \"tel_code\": 234\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"纽埃\",\n" +
                "            \"country_code\": \"NIU\",\n" +
                "            \"tel_code\": 683\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"朝鲜\",\n" +
                "            \"country_code\": \"PRK\",\n" +
                "            \"tel_code\": 850\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"北马里亚纳群岛\",\n" +
                "            \"country_code\": \"MNP\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "       \n" +
                "        {\n" +
                "            \"country\": \"阿曼\",\n" +
                "            \"country_code\": \"OMN\",\n" +
                "            \"tel_code\": 968\n" +
                "        },\n" +
                "       \n" +
                "        {\n" +
                "            \"country\": \"帕劳\",\n" +
                "            \"country_code\": \"PLW\",\n" +
                "            \"tel_code\": 680\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"巴勒斯坦\",\n" +
                "            \"country_code\": \"PSE\",\n" +
                "            \"tel_code\": 970\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"巴拿马\",\n" +
                "            \"country_code\": \"PAN\",\n" +
                "            \"tel_code\": 507\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"巴布亚新几内亚\",\n" +
                "            \"country_code\": \"PNG\",\n" +
                "            \"tel_code\": 675\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"巴拉圭\",\n" +
                "            \"country_code\": \"PRY\",\n" +
                "            \"tel_code\": 595\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"秘鲁\",\n" +
                "            \"country_code\": \"PER\",\n" +
                "            \"tel_code\": 51\n" +
                "        },\n" +
                "        \n" +
                "        {\n" +
                "            \"country\": \"皮特凯恩\",\n" +
                "            \"country_code\": \"PCN\",\n" +
                "            \"tel_code\": 64\n" +
                "        },\n" +
                "      \n" +
                "     \n" +
                "        {\n" +
                "            \"country\": \"波多黎各\",\n" +
                "            \"country_code\": \"PRI\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"卡塔尔\",\n" +
                "            \"country_code\": \"QAT\",\n" +
                "            \"tel_code\": 974\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"刚果共和国\",\n" +
                "            \"country_code\": \"COG\",\n" +
                "            \"tel_code\": 242\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"留尼汪\",\n" +
                "            \"country_code\": \"REU\",\n" +
                "            \"tel_code\": 262\n" +
                "        },\n" +
                "       \n" +
                "       \n" +
                "        {\n" +
                "            \"country\": \"卢旺达\",\n" +
                "            \"country_code\": \"RWA\",\n" +
                "            \"tel_code\": 250\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"圣巴特勒米\",\n" +
                "            \"country_code\": \"BLM\",\n" +
                "            \"tel_code\": 590\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"圣赫勒拿\",\n" +
                "            \"country_code\": \"SHN\",\n" +
                "            \"tel_code\": 290\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"圣基茨和尼维斯\",\n" +
                "            \"country_code\": \"KNA\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"圣卢西亚\",\n" +
                "            \"country_code\": \"LCA\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"圣马丁\",\n" +
                "            \"country_code\": \"MAF\",\n" +
                "            \"tel_code\": 590\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"圣皮埃尔和密克隆\",\n" +
                "            \"country_code\": \"SPM\",\n" +
                "            \"tel_code\": 508\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"圣文森特和格林纳丁斯\",\n" +
                "            \"country_code\": \"VCT\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"萨摩亚\",\n" +
                "            \"country_code\": \"WSM\",\n" +
                "            \"tel_code\": 685\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"圣马力诺\",\n" +
                "            \"country_code\": \"SMR\",\n" +
                "            \"tel_code\": 378\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"圣多美和普林西比\",\n" +
                "            \"country_code\": \"STP\",\n" +
                "            \"tel_code\": 239\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"沙特阿拉伯\",\n" +
                "            \"country_code\": \"SAU\",\n" +
                "            \"tel_code\": 966\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"塞内加尔\",\n" +
                "            \"country_code\": \"SEN\",\n" +
                "            \"tel_code\": 221\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"塞尔维亚\",\n" +
                "            \"country_code\": \"SRB\",\n" +
                "            \"tel_code\": 381\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"塞舌尔\",\n" +
                "            \"country_code\": \"SYC\",\n" +
                "            \"tel_code\": 248\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"塞拉利昂\",\n" +
                "            \"country_code\": \"SLE\",\n" +
                "            \"tel_code\": 232\n" +
                "        },\n" +
                "        \n" +
                "        {\n" +
                "            \"country\": \"荷属圣马丁\",\n" +
                "            \"country_code\": \"SXM\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "       \n" +
                "     \n" +
                "        {\n" +
                "            \"country\": \"所罗门群岛\",\n" +
                "            \"country_code\": \"SLB\",\n" +
                "            \"tel_code\": 677\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"索马里\",\n" +
                "            \"country_code\": \"SOM\",\n" +
                "            \"tel_code\": 252\n" +
                "        },\n" +
                "       \n" +
                "       \n" +
                "        {\n" +
                "            \"country\": \"南苏丹\",\n" +
                "            \"country_code\": \"SSD\",\n" +
                "            \"tel_code\": 211\n" +
                "        },\n" +
                "      \n" +
                "       \n" +
                "        {\n" +
                "            \"country\": \"苏丹\",\n" +
                "            \"country_code\": \"SDN\",\n" +
                "            \"tel_code\": 249\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"苏里南\",\n" +
                "            \"country_code\": \"SUR\",\n" +
                "            \"tel_code\": 597\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"斯瓦尔巴特和扬马延\",\n" +
                "            \"country_code\": \"SJM\",\n" +
                "            \"tel_code\": 47\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"斯威士兰\",\n" +
                "            \"country_code\": \"SWZ\",\n" +
                "            \"tel_code\": 268\n" +
                "        },\n" +
                "      \n" +
                "        {\n" +
                "            \"country\": \"叙利亚\",\n" +
                "            \"country_code\": \"SYR\",\n" +
                "            \"tel_code\": 963\n" +
                "        },\n" +
                "        \n" +
                "        {\n" +
                "            \"country\": \"塔吉克斯坦\",\n" +
                "            \"country_code\": \"TJK\",\n" +
                "            \"tel_code\": 992\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"坦桑尼亚\",\n" +
                "            \"country_code\": \"TZA\",\n" +
                "            \"tel_code\": 255\n" +
                "        },\n" +
                "        \n" +
                "        {\n" +
                "            \"country\": \"多哥\",\n" +
                "            \"country_code\": \"TGO\",\n" +
                "            \"tel_code\": 228\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"托克劳\",\n" +
                "            \"country_code\": \"TKL\",\n" +
                "            \"tel_code\": 690\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"汤加\",\n" +
                "            \"country_code\": \"TON\",\n" +
                "            \"tel_code\": 676\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"特立尼达和多巴哥\",\n" +
                "            \"country_code\": \"TTO\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "       \n" +
                "       \n" +
                "        {\n" +
                "            \"country\": \"土库曼斯坦\",\n" +
                "            \"country_code\": \"TKM\",\n" +
                "            \"tel_code\": 993\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"特克斯和凯科斯群岛\",\n" +
                "            \"country_code\": \"TCA\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"图瓦卢\",\n" +
                "            \"country_code\": \"TUV\",\n" +
                "            \"tel_code\": 688\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"美属维尔京群岛\",\n" +
                "            \"country_code\": \"VIR\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"乌干达\",\n" +
                "            \"country_code\": \"UGA\",\n" +
                "            \"tel_code\": 256\n" +
                "        },\n" +
                "       \n" +
                "        {\n" +
                "            \"country\": \"阿拉伯联合酋长国\",\n" +
                "            \"country_code\": \"ARE\",\n" +
                "            \"tel_code\": 971\n" +
                "        },\n" +
                "       \n" +
                "        {\n" +
                "            \"country\": \"美国\",\n" +
                "            \"country_code\": \"USA\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"乌拉圭\",\n" +
                "            \"country_code\": \"URY\",\n" +
                "            \"tel_code\": 598\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"乌兹别克斯坦\",\n" +
                "            \"country_code\": \"UZB\",\n" +
                "            \"tel_code\": 998\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"瓦努阿图\",\n" +
                "            \"country_code\": \"VUT\",\n" +
                "            \"tel_code\": 678\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"梵蒂冈\",\n" +
                "            \"country_code\": \"VAT\",\n" +
                "            \"tel_code\": 379\n" +
                "        },\n" +
                "       \n" +
                "        {\n" +
                "            \"country\": \"瓦利斯和富图纳\",\n" +
                "            \"country_code\": \"WLF\",\n" +
                "            \"tel_code\": 681\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"西撒哈拉\",\n" +
                "            \"country_code\": \"ESH\",\n" +
                "            \"tel_code\": 212\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"也门\",\n" +
                "            \"country_code\": \"YEM\",\n" +
                "            \"tel_code\": 967\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"赞比亚\",\n" +
                "            \"country_code\": \"ZMB\",\n" +
                "            \"tel_code\": 260\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"津巴布韦\",\n" +
                "            \"country_code\": \"ZWE\",\n" +
                "            \"tel_code\": 263\n" +
                "        }\n" +
                "    ],\n" +
                "    \"is_succ\": true\n" +
                "}\n";

        String enc="{\n" +
                "    \"data\": [\n" +
                "        {\n" +
                "            \"country\": \"Afghanistan\",\n" +
                "            \"country_code\": \"AFG\",\n" +
                "            \"tel_code\": 93\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Albania\",\n" +
                "            \"country_code\": \"ALB\",\n" +
                "            \"tel_code\": 355\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Algeria\",\n" +
                "            \"country_code\": \"DZA\",\n" +
                "            \"tel_code\": 213\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"American Samoa\",\n" +
                "            \"country_code\": \"ASM\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Andorra\",\n" +
                "            \"country_code\": \"AND\",\n" +
                "            \"tel_code\": 376\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Angola\",\n" +
                "            \"country_code\": \"AGO\",\n" +
                "            \"tel_code\": 244\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Anguilla\",\n" +
                "            \"country_code\": \"AIA\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Antarctica\",\n" +
                "            \"country_code\": \"ATA\",\n" +
                "            \"tel_code\": 672\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Antigua and Barbuda\",\n" +
                "            \"country_code\": \"ATG\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Argentina\",\n" +
                "            \"country_code\": \"ARG\",\n" +
                "            \"tel_code\": 54\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Armenia\",\n" +
                "            \"country_code\": \"ARM\",\n" +
                "            \"tel_code\": 374\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Aruba\",\n" +
                "            \"country_code\": \"ABW\",\n" +
                "            \"tel_code\": 297\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Australia\",\n" +
                "            \"country_code\": \"AUS\",\n" +
                "            \"tel_code\": 61\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Austria\",\n" +
                "            \"country_code\": \"AUT\",\n" +
                "            \"tel_code\": 43\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Azerbaijan\",\n" +
                "            \"country_code\": \"AZE\",\n" +
                "            \"tel_code\": 994\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Bahamas\",\n" +
                "            \"country_code\": \"BHS\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Bahrain\",\n" +
                "            \"country_code\": \"BHR\",\n" +
                "            \"tel_code\": 973\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Bangladesh\",\n" +
                "            \"country_code\": \"BGD\",\n" +
                "            \"tel_code\": 880\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Barbados\",\n" +
                "            \"country_code\": \"BRB\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Belarus\",\n" +
                "            \"country_code\": \"BLR\",\n" +
                "            \"tel_code\": 375\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Belgium\",\n" +
                "            \"country_code\": \"BEL\",\n" +
                "            \"tel_code\": 32\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Belize\",\n" +
                "            \"country_code\": \"BLZ\",\n" +
                "            \"tel_code\": 501\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Benin\",\n" +
                "            \"country_code\": \"BEN\",\n" +
                "            \"tel_code\": 229\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Bermuda\",\n" +
                "            \"country_code\": \"BMU\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Bhutan\",\n" +
                "            \"country_code\": \"BTN\",\n" +
                "            \"tel_code\": 975\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Bolivia\",\n" +
                "            \"country_code\": \"BOL\",\n" +
                "            \"tel_code\": 591\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Bosnia and Herzegovina\",\n" +
                "            \"country_code\": \"BIH\",\n" +
                "            \"tel_code\": 387\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Botswana\",\n" +
                "            \"country_code\": \"BWA\",\n" +
                "            \"tel_code\": 267\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Brazil\",\n" +
                "            \"country_code\": \"BRA\",\n" +
                "            \"tel_code\": 55\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"British Indian Ocean Territory\",\n" +
                "            \"country_code\": \"IOT\",\n" +
                "            \"tel_code\": 246\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"British Virgin Islands\",\n" +
                "            \"country_code\": \"VGB\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Brunei\",\n" +
                "            \"country_code\": \"BRN\",\n" +
                "            \"tel_code\": 673\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Bulgaria\",\n" +
                "            \"country_code\": \"BGR\",\n" +
                "            \"tel_code\": 359\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Burkina Faso\",\n" +
                "            \"country_code\": \"BFA\",\n" +
                "            \"tel_code\": 226\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Burundi\",\n" +
                "            \"country_code\": \"BDI\",\n" +
                "            \"tel_code\": 257\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Cambodia\",\n" +
                "            \"country_code\": \"KHM\",\n" +
                "            \"tel_code\": 855\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Cameroon\",\n" +
                "            \"country_code\": \"CMR\",\n" +
                "            \"tel_code\": 237\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Canada\",\n" +
                "            \"country_code\": \"CAN\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Cape Verde\",\n" +
                "            \"country_code\": \"CPV\",\n" +
                "            \"tel_code\": 238\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Cayman Islands\",\n" +
                "            \"country_code\": \"CYM\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Central African Republic\",\n" +
                "            \"country_code\": \"CAF\",\n" +
                "            \"tel_code\": 236\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Chad\",\n" +
                "            \"country_code\": \"TCD\",\n" +
                "            \"tel_code\": 235\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Chile\",\n" +
                "            \"country_code\": \"CHL\",\n" +
                "            \"tel_code\": 56\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"China\",\n" +
                "            \"country_code\": \"CHN\",\n" +
                "            \"tel_code\": 86\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Christmas Island\",\n" +
                "            \"country_code\": \"CXR\",\n" +
                "            \"tel_code\": 61\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Cocos Islands\",\n" +
                "            \"country_code\": \"CCK\",\n" +
                "            \"tel_code\": 61\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Colombia\",\n" +
                "            \"country_code\": \"COL\",\n" +
                "            \"tel_code\": 57\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Comoros\",\n" +
                "            \"country_code\": \"COM\",\n" +
                "            \"tel_code\": 269\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Cook Islands\",\n" +
                "            \"country_code\": \"COK\",\n" +
                "            \"tel_code\": 682\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Costa Rica\",\n" +
                "            \"country_code\": \"CRI\",\n" +
                "            \"tel_code\": 506\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Croatia\",\n" +
                "            \"country_code\": \"HRV\",\n" +
                "            \"tel_code\": 385\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Cuba\",\n" +
                "            \"country_code\": \"CUB\",\n" +
                "            \"tel_code\": 53\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Curacao\",\n" +
                "            \"country_code\": \"CUW\",\n" +
                "            \"tel_code\": 599\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Cyprus\",\n" +
                "            \"country_code\": \"CYP\",\n" +
                "            \"tel_code\": 357\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Czech Republic\",\n" +
                "            \"country_code\": \"CZE\",\n" +
                "            \"tel_code\": 420\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Democratic Republic of the Congo\",\n" +
                "            \"country_code\": \"COD\",\n" +
                "            \"tel_code\": 243\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Denmark\",\n" +
                "            \"country_code\": \"DNK\",\n" +
                "            \"tel_code\": 45\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Djibouti\",\n" +
                "            \"country_code\": \"DJI\",\n" +
                "            \"tel_code\": 253\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Dominica\",\n" +
                "            \"country_code\": \"DMA\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Dominican Republic\",\n" +
                "            \"country_code\": \"DOM\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"East Timor\",\n" +
                "            \"country_code\": \"TLS\",\n" +
                "            \"tel_code\": 670\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Ecuador\",\n" +
                "            \"country_code\": \"ECU\",\n" +
                "            \"tel_code\": 593\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Egypt\",\n" +
                "            \"country_code\": \"EGY\",\n" +
                "            \"tel_code\": 20\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"El Salvador\",\n" +
                "            \"country_code\": \"SLV\",\n" +
                "            \"tel_code\": 503\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Equatorial Guinea\",\n" +
                "            \"country_code\": \"GNQ\",\n" +
                "            \"tel_code\": 240\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Eritrea\",\n" +
                "            \"country_code\": \"ERI\",\n" +
                "            \"tel_code\": 291\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Estonia\",\n" +
                "            \"country_code\": \"EST\",\n" +
                "            \"tel_code\": 372\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Ethiopia\",\n" +
                "            \"country_code\": \"ETH\",\n" +
                "            \"tel_code\": 251\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Falkland Islands\",\n" +
                "            \"country_code\": \"FLK\",\n" +
                "            \"tel_code\": 500\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Faroe Islands\",\n" +
                "            \"country_code\": \"FRO\",\n" +
                "            \"tel_code\": 298\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Fiji\",\n" +
                "            \"country_code\": \"FJI\",\n" +
                "            \"tel_code\": 679\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Finland\",\n" +
                "            \"country_code\": \"FIN\",\n" +
                "            \"tel_code\": 358\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"France\",\n" +
                "            \"country_code\": \"FRA\",\n" +
                "            \"tel_code\": 33\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"French Polynesia\",\n" +
                "            \"country_code\": \"PYF\",\n" +
                "            \"tel_code\": 689\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Gabon\",\n" +
                "            \"country_code\": \"GAB\",\n" +
                "            \"tel_code\": 241\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Gambia\",\n" +
                "            \"country_code\": \"GMB\",\n" +
                "            \"tel_code\": 220\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Georgia\",\n" +
                "            \"country_code\": \"GEO\",\n" +
                "            \"tel_code\": 995\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Germany\",\n" +
                "            \"country_code\": \"DEU\",\n" +
                "            \"tel_code\": 49\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Ghana\",\n" +
                "            \"country_code\": \"GHA\",\n" +
                "            \"tel_code\": 233\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Gibraltar\",\n" +
                "            \"country_code\": \"GIB\",\n" +
                "            \"tel_code\": 350\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Greece\",\n" +
                "            \"country_code\": \"GRC\",\n" +
                "            \"tel_code\": 30\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Greenland\",\n" +
                "            \"country_code\": \"GRL\",\n" +
                "            \"tel_code\": 299\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Grenada\",\n" +
                "            \"country_code\": \"GRD\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Guam\",\n" +
                "            \"country_code\": \"GUM\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Guatemala\",\n" +
                "            \"country_code\": \"GTM\",\n" +
                "            \"tel_code\": 502\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Guernsey\",\n" +
                "            \"country_code\": \"GGY\",\n" +
                "            \"tel_code\": 44\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Guinea\",\n" +
                "            \"country_code\": \"GIN\",\n" +
                "            \"tel_code\": 224\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Guinea-Bissau\",\n" +
                "            \"country_code\": \"GNB\",\n" +
                "            \"tel_code\": 245\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Guyana\",\n" +
                "            \"country_code\": \"GUY\",\n" +
                "            \"tel_code\": 592\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Haiti\",\n" +
                "            \"country_code\": \"HTI\",\n" +
                "            \"tel_code\": 509\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Honduras\",\n" +
                "            \"country_code\": \"HND\",\n" +
                "            \"tel_code\": 504\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Hong Kong SAR，China\",\n" +
                "            \"country_code\": \"HKG\",\n" +
                "            \"tel_code\": 852\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Hungary\",\n" +
                "            \"country_code\": \"HUN\",\n" +
                "            \"tel_code\": 36\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Iceland\",\n" +
                "            \"country_code\": \"ISL\",\n" +
                "            \"tel_code\": 354\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"India\",\n" +
                "            \"country_code\": \"IND\",\n" +
                "            \"tel_code\": 91\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Indonesia\",\n" +
                "            \"country_code\": \"IDN\",\n" +
                "            \"tel_code\": 62\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Iran\",\n" +
                "            \"country_code\": \"IRN\",\n" +
                "            \"tel_code\": 98\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Iraq\",\n" +
                "            \"country_code\": \"IRQ\",\n" +
                "            \"tel_code\": 964\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Ireland\",\n" +
                "            \"country_code\": \"IRL\",\n" +
                "            \"tel_code\": 353\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Isle of Man\",\n" +
                "            \"country_code\": \"IMN\",\n" +
                "            \"tel_code\": 44\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Israel\",\n" +
                "            \"country_code\": \"ISR\",\n" +
                "            \"tel_code\": 972\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Italy\",\n" +
                "            \"country_code\": \"ITA\",\n" +
                "            \"tel_code\": 39\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Ivory Coast\",\n" +
                "            \"country_code\": \"CIV\",\n" +
                "            \"tel_code\": 225\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Jamaica\",\n" +
                "            \"country_code\": \"JAM\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Japan\",\n" +
                "            \"country_code\": \"JPN\",\n" +
                "            \"tel_code\": 81\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Jersey\",\n" +
                "            \"country_code\": \"JEY\",\n" +
                "            \"tel_code\": 44\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Jordan\",\n" +
                "            \"country_code\": \"JOR\",\n" +
                "            \"tel_code\": 962\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Kazakhstan\",\n" +
                "            \"country_code\": \"KAZ\",\n" +
                "            \"tel_code\": 7\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Kenya\",\n" +
                "            \"country_code\": \"KEN\",\n" +
                "            \"tel_code\": 254\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Kiribati\",\n" +
                "            \"country_code\": \"KIR\",\n" +
                "            \"tel_code\": 686\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Kosovo\",\n" +
                "            \"country_code\": \"XKX\",\n" +
                "            \"tel_code\": 383\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Kuwait\",\n" +
                "            \"country_code\": \"KWT\",\n" +
                "            \"tel_code\": 965\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Kyrgyzstan\",\n" +
                "            \"country_code\": \"KGZ\",\n" +
                "            \"tel_code\": 996\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Laos\",\n" +
                "            \"country_code\": \"LAO\",\n" +
                "            \"tel_code\": 856\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Latvia\",\n" +
                "            \"country_code\": \"LVA\",\n" +
                "            \"tel_code\": 371\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Lebanon\",\n" +
                "            \"country_code\": \"LBN\",\n" +
                "            \"tel_code\": 961\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Lesotho\",\n" +
                "            \"country_code\": \"LSO\",\n" +
                "            \"tel_code\": 266\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Liberia\",\n" +
                "            \"country_code\": \"LBR\",\n" +
                "            \"tel_code\": 231\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Libya\",\n" +
                "            \"country_code\": \"LBY\",\n" +
                "            \"tel_code\": 218\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Liechtenstein\",\n" +
                "            \"country_code\": \"LIE\",\n" +
                "            \"tel_code\": 423\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Lithuania\",\n" +
                "            \"country_code\": \"LTU\",\n" +
                "            \"tel_code\": 370\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Luxembourg\",\n" +
                "            \"country_code\": \"LUX\",\n" +
                "            \"tel_code\": 352\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Macau SAR，China\",\n" +
                "            \"country_code\": \"MAC\",\n" +
                "            \"tel_code\": 853\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Macedonia\",\n" +
                "            \"country_code\": \"MKD\",\n" +
                "            \"tel_code\": 389\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Madagascar\",\n" +
                "            \"country_code\": \"MDG\",\n" +
                "            \"tel_code\": 261\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Malawi\",\n" +
                "            \"country_code\": \"MWI\",\n" +
                "            \"tel_code\": 265\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Malaysia\",\n" +
                "            \"country_code\": \"MYS\",\n" +
                "            \"tel_code\": 60\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Maldives\",\n" +
                "            \"country_code\": \"MDV\",\n" +
                "            \"tel_code\": 960\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Mali\",\n" +
                "            \"country_code\": \"MLI\",\n" +
                "            \"tel_code\": 223\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Malta\",\n" +
                "            \"country_code\": \"MLT\",\n" +
                "            \"tel_code\": 356\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Marshall Islands\",\n" +
                "            \"country_code\": \"MHL\",\n" +
                "            \"tel_code\": 692\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Mauritania\",\n" +
                "            \"country_code\": \"MRT\",\n" +
                "            \"tel_code\": 222\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Mauritius\",\n" +
                "            \"country_code\": \"MUS\",\n" +
                "            \"tel_code\": 230\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Mayotte\",\n" +
                "            \"country_code\": \"MYT\",\n" +
                "            \"tel_code\": 262\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Mexico\",\n" +
                "            \"country_code\": \"MEX\",\n" +
                "            \"tel_code\": 52\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Micronesia\",\n" +
                "            \"country_code\": \"FSM\",\n" +
                "            \"tel_code\": 691\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Moldova\",\n" +
                "            \"country_code\": \"MDA\",\n" +
                "            \"tel_code\": 373\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Monaco\",\n" +
                "            \"country_code\": \"MCO\",\n" +
                "            \"tel_code\": 377\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Mongolia\",\n" +
                "            \"country_code\": \"MNG\",\n" +
                "            \"tel_code\": 976\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Montenegro\",\n" +
                "            \"country_code\": \"MNE\",\n" +
                "            \"tel_code\": 382\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Montserrat\",\n" +
                "            \"country_code\": \"MSR\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Morocco\",\n" +
                "            \"country_code\": \"MAR\",\n" +
                "            \"tel_code\": 212\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Mozambique\",\n" +
                "            \"country_code\": \"MOZ\",\n" +
                "            \"tel_code\": 258\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Myanmar\",\n" +
                "            \"country_code\": \"MMR\",\n" +
                "            \"tel_code\": 95\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Namibia\",\n" +
                "            \"country_code\": \"NAM\",\n" +
                "            \"tel_code\": 264\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Nauru\",\n" +
                "            \"country_code\": \"NRU\",\n" +
                "            \"tel_code\": 674\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Nepal\",\n" +
                "            \"country_code\": \"NPL\",\n" +
                "            \"tel_code\": 977\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Netherlands\",\n" +
                "            \"country_code\": \"NLD\",\n" +
                "            \"tel_code\": 31\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Netherlands Antilles\",\n" +
                "            \"country_code\": \"ANT\",\n" +
                "            \"tel_code\": 599\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"New Caledonia\",\n" +
                "            \"country_code\": \"NCL\",\n" +
                "            \"tel_code\": 687\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"New Zealand\",\n" +
                "            \"country_code\": \"NZL\",\n" +
                "            \"tel_code\": 64\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Nicaragua\",\n" +
                "            \"country_code\": \"NIC\",\n" +
                "            \"tel_code\": 505\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Niger\",\n" +
                "            \"country_code\": \"NER\",\n" +
                "            \"tel_code\": 227\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Nigeria\",\n" +
                "            \"country_code\": \"NGA\",\n" +
                "            \"tel_code\": 234\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Niue\",\n" +
                "            \"country_code\": \"NIU\",\n" +
                "            \"tel_code\": 683\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"North Korea\",\n" +
                "            \"country_code\": \"PRK\",\n" +
                "            \"tel_code\": 850\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Northern Mariana Islands\",\n" +
                "            \"country_code\": \"MNP\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Norway\",\n" +
                "            \"country_code\": \"NOR\",\n" +
                "            \"tel_code\": 47\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Oman\",\n" +
                "            \"country_code\": \"OMN\",\n" +
                "            \"tel_code\": 968\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Pakistan\",\n" +
                "            \"country_code\": \"PAK\",\n" +
                "            \"tel_code\": 92\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Palau\",\n" +
                "            \"country_code\": \"PLW\",\n" +
                "            \"tel_code\": 680\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Palestine\",\n" +
                "            \"country_code\": \"PSE\",\n" +
                "            \"tel_code\": 970\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Panama\",\n" +
                "            \"country_code\": \"PAN\",\n" +
                "            \"tel_code\": 507\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Papua New Guinea\",\n" +
                "            \"country_code\": \"PNG\",\n" +
                "            \"tel_code\": 675\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Paraguay\",\n" +
                "            \"country_code\": \"PRY\",\n" +
                "            \"tel_code\": 595\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Peru\",\n" +
                "            \"country_code\": \"PER\",\n" +
                "            \"tel_code\": 51\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Philippines\",\n" +
                "            \"country_code\": \"PHL\",\n" +
                "            \"tel_code\": 63\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Pitcairn\",\n" +
                "            \"country_code\": \"PCN\",\n" +
                "            \"tel_code\": 64\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Poland\",\n" +
                "            \"country_code\": \"POL\",\n" +
                "            \"tel_code\": 48\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Portugal\",\n" +
                "            \"country_code\": \"PRT\",\n" +
                "            \"tel_code\": 351\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Puerto Rico\",\n" +
                "            \"country_code\": \"PRI\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Qatar\",\n" +
                "            \"country_code\": \"QAT\",\n" +
                "            \"tel_code\": 974\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Republic of the Congo\",\n" +
                "            \"country_code\": \"COG\",\n" +
                "            \"tel_code\": 242\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Reunion\",\n" +
                "            \"country_code\": \"REU\",\n" +
                "            \"tel_code\": 262\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Romania\",\n" +
                "            \"country_code\": \"ROU\",\n" +
                "            \"tel_code\": 40\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Russia\",\n" +
                "            \"country_code\": \"RUS\",\n" +
                "            \"tel_code\": 7\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Rwanda\",\n" +
                "            \"country_code\": \"RWA\",\n" +
                "            \"tel_code\": 250\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Saint Barthelemy\",\n" +
                "            \"country_code\": \"BLM\",\n" +
                "            \"tel_code\": 590\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Saint Helena\",\n" +
                "            \"country_code\": \"SHN\",\n" +
                "            \"tel_code\": 290\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Saint Kitts and Nevis\",\n" +
                "            \"country_code\": \"KNA\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Saint Lucia\",\n" +
                "            \"country_code\": \"LCA\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Saint Martin\",\n" +
                "            \"country_code\": \"MAF\",\n" +
                "            \"tel_code\": 590\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Saint Pierre and Miquelon\",\n" +
                "            \"country_code\": \"SPM\",\n" +
                "            \"tel_code\": 508\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Saint Vincent and the Grenadines\",\n" +
                "            \"country_code\": \"VCT\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Samoa\",\n" +
                "            \"country_code\": \"WSM\",\n" +
                "            \"tel_code\": 685\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"San Marino\",\n" +
                "            \"country_code\": \"SMR\",\n" +
                "            \"tel_code\": 378\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Sao Tome and Principe\",\n" +
                "            \"country_code\": \"STP\",\n" +
                "            \"tel_code\": 239\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Saudi Arabia\",\n" +
                "            \"country_code\": \"SAU\",\n" +
                "            \"tel_code\": 966\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Senegal\",\n" +
                "            \"country_code\": \"SEN\",\n" +
                "            \"tel_code\": 221\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Serbia\",\n" +
                "            \"country_code\": \"SRB\",\n" +
                "            \"tel_code\": 381\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Seychelles\",\n" +
                "            \"country_code\": \"SYC\",\n" +
                "            \"tel_code\": 248\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Sierra Leone\",\n" +
                "            \"country_code\": \"SLE\",\n" +
                "            \"tel_code\": 232\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Singapore\",\n" +
                "            \"country_code\": \"SGP\",\n" +
                "            \"tel_code\": 65\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Sint Maarten\",\n" +
                "            \"country_code\": \"SXM\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Slovakia\",\n" +
                "            \"country_code\": \"SVK\",\n" +
                "            \"tel_code\": 421\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Slovenia\",\n" +
                "            \"country_code\": \"SVN\",\n" +
                "            \"tel_code\": 386\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Solomon Islands\",\n" +
                "            \"country_code\": \"SLB\",\n" +
                "            \"tel_code\": 677\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Somalia\",\n" +
                "            \"country_code\": \"SOM\",\n" +
                "            \"tel_code\": 252\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"South Africa\",\n" +
                "            \"country_code\": \"ZAF\",\n" +
                "            \"tel_code\": 27\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"South Korea\",\n" +
                "            \"country_code\": \"KOR\",\n" +
                "            \"tel_code\": 82\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"South Sudan\",\n" +
                "            \"country_code\": \"SSD\",\n" +
                "            \"tel_code\": 211\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Spain\",\n" +
                "            \"country_code\": \"ESP\",\n" +
                "            \"tel_code\": 34\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Sri Lanka\",\n" +
                "            \"country_code\": \"LKA\",\n" +
                "            \"tel_code\": 94\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Sudan\",\n" +
                "            \"country_code\": \"SDN\",\n" +
                "            \"tel_code\": 249\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Suriname\",\n" +
                "            \"country_code\": \"SUR\",\n" +
                "            \"tel_code\": 597\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Svalbard and Jan Mayen\",\n" +
                "            \"country_code\": \"SJM\",\n" +
                "            \"tel_code\": 47\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Swaziland\",\n" +
                "            \"country_code\": \"SWZ\",\n" +
                "            \"tel_code\": 268\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Sweden\",\n" +
                "            \"country_code\": \"SWE\",\n" +
                "            \"tel_code\": 46\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Switzerland\",\n" +
                "            \"country_code\": \"CHE\",\n" +
                "            \"tel_code\": 41\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Syria\",\n" +
                "            \"country_code\": \"SYR\",\n" +
                "            \"tel_code\": 963\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Taiwan，Province of China\",\n" +
                "            \"country_code\": \"TWN\",\n" +
                "            \"tel_code\": 886\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Tajikistan\",\n" +
                "            \"country_code\": \"TJK\",\n" +
                "            \"tel_code\": 992\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Tanzania\",\n" +
                "            \"country_code\": \"TZA\",\n" +
                "            \"tel_code\": 255\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Thailand\",\n" +
                "            \"country_code\": \"THA\",\n" +
                "            \"tel_code\": 66\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Togo\",\n" +
                "            \"country_code\": \"TGO\",\n" +
                "            \"tel_code\": 228\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Tokelau\",\n" +
                "            \"country_code\": \"TKL\",\n" +
                "            \"tel_code\": 690\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Tonga\",\n" +
                "            \"country_code\": \"TON\",\n" +
                "            \"tel_code\": 676\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Trinidad and Tobago\",\n" +
                "            \"country_code\": \"TTO\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Tunisia\",\n" +
                "            \"country_code\": \"TUN\",\n" +
                "            \"tel_code\": 216\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Turkey\",\n" +
                "            \"country_code\": \"TUR\",\n" +
                "            \"tel_code\": 90\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Turkmenistan\",\n" +
                "            \"country_code\": \"TKM\",\n" +
                "            \"tel_code\": 993\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Turks and Caicos Islands\",\n" +
                "            \"country_code\": \"TCA\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Tuvalu\",\n" +
                "            \"country_code\": \"TUV\",\n" +
                "            \"tel_code\": 688\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"U.S. Virgin Islands\",\n" +
                "            \"country_code\": \"VIR\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Uganda\",\n" +
                "            \"country_code\": \"UGA\",\n" +
                "            \"tel_code\": 256\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Ukraine\",\n" +
                "            \"country_code\": \"UKR\",\n" +
                "            \"tel_code\": 380\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"United Arab Emirates\",\n" +
                "            \"country_code\": \"ARE\",\n" +
                "            \"tel_code\": 971\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"United Kingdom\",\n" +
                "            \"country_code\": \"GBR\",\n" +
                "            \"tel_code\": 44\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"United States\",\n" +
                "            \"country_code\": \"USA\",\n" +
                "            \"tel_code\": 1\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Uruguay\",\n" +
                "            \"country_code\": \"URY\",\n" +
                "            \"tel_code\": 598\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Uzbekistan\",\n" +
                "            \"country_code\": \"UZB\",\n" +
                "            \"tel_code\": 998\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Vanuatu\",\n" +
                "            \"country_code\": \"VUT\",\n" +
                "            \"tel_code\": 678\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Vatican\",\n" +
                "            \"country_code\": \"VAT\",\n" +
                "            \"tel_code\": 379\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Venezuela\",\n" +
                "            \"country_code\": \"VEN\",\n" +
                "            \"tel_code\": 58\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Vietnam\",\n" +
                "            \"country_code\": \"VNM\",\n" +
                "            \"tel_code\": 84\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Wallis and Futuna\",\n" +
                "            \"country_code\": \"WLF\",\n" +
                "            \"tel_code\": 681\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Western Sahara\",\n" +
                "            \"country_code\": \"ESH\",\n" +
                "            \"tel_code\": 212\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Yemen\",\n" +
                "            \"country_code\": \"YEM\",\n" +
                "            \"tel_code\": 967\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Zambia\",\n" +
                "            \"country_code\": \"ZMB\",\n" +
                "            \"tel_code\": 260\n" +
                "        },\n" +
                "        {\n" +
                "            \"country\": \"Zimbabwe\",\n" +
                "            \"country_code\": \"ZWE\",\n" +
                "            \"tel_code\": 263\n" +
                "        }\n" +
                "    ],\n" +
                "    \"is_succ\": true\n" +
                "}";
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.configure(DeserializationFeature.FAIL_ON_IGNORED_PROPERTIES, false);
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        Set<Country> china = objectMapper.readValue(source, CountryData.class).getData();
        Set<Country> us = objectMapper.readValue(dest, CountryData.class).getData();
        Set<Country> english =objectMapper.readValue(enc, CountryData.class).getData();
        Map<String,String> map=new HashMap<>(128);
        for(Country country:english){
            map.put(country.getCountry_code(),country.getCountry());
        }

        us.addAll(china);
        System.out.println(us.size());
        for (Country country : us) {
            if(map.get(country.getCountry_code()) ==null){
                System.out.println("Country_code错误:"  +country.getCountry_code());
            }
            country.setCountry(map.get(country.getCountry_code()));
            System.out.println(objectMapper.writeValueAsString(country));
        }
    }

    @Data
    private static class Country {
        private String country;
        private String country_code;
        private String tel_code;
    }

    @Data
    public static class CountryData {
        private Set<Country> data;
    }


}
