(* range: int -> int -> int list *)

let _ =
        let range: int -> int -> int list = 
                fun lower upper ->
                        let lst1 = [] in
                        let rec addVal n m lst = 
                                if n > m then []
                                else
                                        let lst1 = n :: lst in
                                        if n <> m then addVal (n+1) m lst1
                                        else lst1
                        in
                        List.sort compare (addVal lower upper lst1)
        in
        let print_list lst = 
                print_string "[";
                if (List.length lst) = 0 then print_string "]\n"
                else
                        for i = 0 to ((List.length lst) - 1) do
                                print_int (List.nth lst i);
                                if i <> ((List.length lst) - 1) then print_string ";"
                                else print_string "]\n"
                        done;
        in
        let _ = print_list (range 10 15) in
        let _ = print_list (range (-2) 7) in
        let _ = print_list (range 9 3) in
        let _ = print_list (range 22 22) in
        print_list (range 55 (-12))
        (*List.iter (fun x -> Format.printf "%d " x) (range 3 6)*)
