import CommonCard from '../../../ui/commonUI/eliasCard/CommonCard'

export default function ColumnComponent({ item, querystringModifier }) {
    return (
        <>
            <CommonCard onCardClick={querystringModifier}>
                <>
                    {
                        item && (
                            <span>
                                <pre>
                                    estado heredaro{"\t"}{JSON.stringify({vv:item})}
                                </pre>
                            </span>
                        )
                    }
                </>
            </CommonCard>
        </>
    )
}