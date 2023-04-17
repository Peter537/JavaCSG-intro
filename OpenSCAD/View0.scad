union()
{
    linear_extrude(height = 6.0, twist = 0.0, scale = 1.0, slices = 1, center = true)
    {
        scale([30.0, 5.0])
        {
            M5451();
        }
    }
    linear_extrude(height = 6.0, twist = 0.0, scale = 1.0, slices = 1, center = true)
    {
        scale([5.0, 30.0])
        {
            M5451();
        }
    }
}

module M5451()
{
    polygon
    (
        points =
        [
            [-0.5, -0.5], 
            [0.5, -0.5], 
            [0.5, 0.5], 
            [-0.5, 0.5]
        ],
        paths =
        [
            [0, 1, 2, 3]
        ]
    );
}
