import { useUpdateURLSearchParams } from '../../../lib/utils/hooks/navigation';
import CustomSelect from '../../retrieving/surverys/logic/CustomSelect';
import ColumnComponent from '../../retrieving/surverys/ui/ColumnComponent';
//import DataDeatilsComponent from '../../retrieving/surverys/ui/DataDeatilsComponent';
import './styles/SurveyPageUI.css'
import SvForm from './SvForm'


export default function SurveyPageUI({ trustedData }) {
    const data1 = { id: 1, info: 'Info 1' }
    const data2 = [{ id: 1, name: 'John' }, { id: 2, name: 'Jane' }];

    const updateURLSearchParams = useUpdateURLSearchParams()
    const handleClick = (qsKey, value) => {
        updateURLSearchParams(qsKey, value)
    }

    const r = Math.random()
    const rand = r.toString()

    /*
        lets imagine a `customFunc()` and the needed state variables here
    */

    return (
        <div className="Survey__grid">
            <div className="Survey__col Survey__columnOne">
                <CustomSelect />
                <ColumnComponent 
                    item={data1}
                    querystringModifier={() => handleClick('rondin', data1.id)}
                ></ColumnComponent>
                <SvForm />
            </div>
            <div className="Survey__col">
                {
                    data2.map((el, i) => (
                        <ColumnComponent 
                            item={el}
                            attr='name'
                            keyv={`${el['name']}-${rand}`}
                            querystringModifier={() => handleClick('empresa', el.id)}
                        ></ColumnComponent>
                    ))
                }
            </div>
            <div className="Survey__col">
				{/*    {
                    stateVar && <>{
                        (async () => {
                            customFunc((dataFromCallback) => {
                                if (dataFromCallback != null){
                                    return <DataDeatilsComponent data={{...dataFromCallback}} />
                                }
                            })
                        })()
                        
                    }</>
                }		*/}
            </div>
        </div>
    )
}
