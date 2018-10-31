import worker.*;
import thing.*;
public class WorkerDemo {

	public static void main(String[] args) {
		/**
		 *
		 * 比如我想先让农场主干活，在让农场主叫工人收获
		 * 
		 */
			  // 首先进行初始化
		    FarmMaster master = FarmMaster.getInstance();
		  	// 得到一个农场主实例
		    FieldContainer farm = FieldContainer.getInstance();
		    //农场创建
		    farm.makeNewLand();
		    farm.sow(0, 0);
		    //然后得开垦农地 播种
		    master.harvest(0);
		    //农场主亲自去收获土地1
		    HarvestCommand command = new HarvestCommand();
		    //创建收获命令
		    command.setnumber(0);
		    //命令去2号土地
		    master.call(command);
		    //农场主命令工人去收获土地
		    
		}

}
