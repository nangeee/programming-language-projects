(* sec_last: int list -> int *)

let _ =
        let sec_last lst = 
                match (List.length lst) with
                | 0 | 1 -> 0
                | _ -> List.nth lst ((List.length lst) - 2) in
        let _ = Format.printf "%d\n" (sec_last [1;2;3;4;5]) in
        let _ = Format.printf "%d\n" (sec_last [4;3;2;1]) in
        let _ = Format.printf "%d\n" (sec_last []) in
        let _ = Format.printf "%d\n" (sec_last [1]) in
        Format.printf "%d\n" (sec_last[1;2])
