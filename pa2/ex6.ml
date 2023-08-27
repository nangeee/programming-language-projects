(* sigma: int * int * (int -> int) -> int *)

let _ =
        let sigma: int * int * (int -> int) -> int = 
                fun (n, m, f) ->
                        let sum = 0 in
                        let rec addFunctionRes x m sum1 =
                                if x > m then sum1
                                else
                                        let res = f x in
                                        addFunctionRes (x + 1) m (res + sum1)
                        in
                        addFunctionRes n m sum
        in
        let _ = Format.printf "%d\n" (sigma (10, 10, (fun x -> x))) in
        let _ = Format.printf "%d\n" (sigma (11, 10, (fun x -> x))) in
        let _ = Format.printf "%d\n" (sigma (10, 5, (fun x -> x))) in
        let _ = Format.printf "%d\n" (sigma (1, 10, (fun x -> if x mod 2 = 0 then 1 else 0))) in
        let _ = Format.printf "%d\n" (sigma(2, 10, (fun x -> x + 10))) in
        let _ = Format.printf "%d\n" (sigma (0, 100, (fun x -> 0))) in
        Format.printf "%d\n" (sigma (10, 12, (fun x -> 2 * x)))
