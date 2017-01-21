/*
 * FileName: test.java
 * Copyright (C) 2014 Plusub Tech. Co. Ltd. All Rights Reserved <admin@plusub.com>
 * 
 * Licensed under the Plusub License, Version 1.0 (the "License");
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * author  : xbearin@gmail.com
 * date     : 2014年10月5日 下午2:56:40
 * last modify author :
 * version : 1.0
 */
/**
 * <p>Title: test.java
 * <p>Description: 
 * <p>Copyright: (C) 2014 Plusub Tech. Co. Ltd. All Rights Reserved <admin@plusub.com>
 * <p>Company: www.plusub.com
 * @author xbearin@gmail.com
 * @date 2014年10月5日
 * @version 1.0
 */
package test_interface;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>Title: test.java
 * <p>Description: 
 * <p>Copyright: (C) 2014 Plusub Tech. Co. Ltd. All Rights Reserved <admin@plusub.com>
 * <p>Company: www.plusub.com
 * @author xbearin@gmail.com
 * @date 2014年10月5日
 * @version 1.0
 */
public class test {

    /**
     * <p>Title: main
     * <p>Description: 
     * @param args
     */
    public static void main(String[] args) {
        DegreeTag dd = new DegreeTag();
        dd.setNum(11);
        CRJ(dd);
        List<Tag> tags = new ArrayList<Tag>();
        tags.add(dd);
        CRJ2(tags);
    }
    
    public static void CRJ(Tag tag){
        System.out.println(tag.num);
    }
    
    public static void CRJ2(List<Tag> tags){
        System.out.println(tags.get(0).num);
    }
}
