import worker.*;
import thing.*;
public class WorkerDemo {

	public static void main(String[] args) {
		/**
		 *
		 * ������������ũ�����ɻ����ũ�����й����ջ�
		 * 
		 */
			  // ���Ƚ��г�ʼ��
		    FarmMaster master = FarmMaster.getInstance();
		  	// �õ�һ��ũ����ʵ��
		    FieldContainer farm = FieldContainer.getInstance();
		    //ũ������
		    farm.makeNewLand();
		    farm.sow(0, 0);
		    //Ȼ��ÿ���ũ�� ����
		    master.harvest(0);
		    //ũ��������ȥ�ջ�����1
		    HarvestCommand command = new HarvestCommand();
		    //�����ջ�����
		    command.setnumber(0);
		    //����ȥ2������
		    master.call(command);
		    //ũ���������ȥ�ջ�����
		    
		}

}
