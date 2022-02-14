NUMBERS = [1,7,4,34,7,2,17,19,5,2]
loop PASS from 0 to 8
    loop CURRENT from 0 to 8
        if NUMBERS[CURRENT] > NUMBERS[CURRENT + 1] then
            TEMP = NUMBERS[CURRENT]
            NUMBERS[CURRENT] = NUMBERS[CURRENT+1]
            NUMBERS[CURRENT+1] = TEMP
        end if
    end loop
end loop
loop C from 0 to 9
    output NUMBERS[C]
end loop